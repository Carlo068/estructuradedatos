import sys
import random
from PyQt6.QtWidgets import (QApplication, QVBoxLayout, QLabel, QRadioButton, 
                           QWidget, QGridLayout, QPushButton, QInputDialog)
from PyQt6.QtGui import QPainter, QColor, QPen, QFont
from PyQt6.QtCore import Qt, QPoint

class Graph:
    def __init__(self):
        self.nodes = set()
        self.edges = {}
        self.distances = {}
    
    def add_node(self, value):
        self.nodes.add(value)
        if value not in self.edges:
            self.edges[value] = []
    
    def add_edge(self, from_node, to_node, distance):
        self.edges[from_node].append(to_node)
        self.edges[to_node].append(from_node)
        self.distances[(from_node, to_node)] = distance
        self.distances[(to_node, from_node)] = distance

def dijkstra(graph, initial, end=None):
    visited = {initial: 0}
    path = {}
    nodes = set(graph.nodes)
    
    while nodes:
        min_node = None
        for node in nodes:
            if node in visited:
                if min_node is None:
                    min_node = node
                elif visited[node] < visited[min_node]:
                    min_node = node
        
        if min_node is None:
            break
            
        nodes.remove(min_node)
        current_weight = visited[min_node]
        
        if end and min_node == end:
            break
            
        for edge in graph.edges[min_node]:
            weight = current_weight + graph.distances[(min_node, edge)]
            if edge not in visited or weight < visited[edge]:
                visited[edge] = weight
                path[edge] = min_node
    
    return visited, path

def get_shortest_path(source, target, paths):
    if target not in paths:
        return None 
        
    path = [target]
    current = target
    
    while current != source:
        current = paths[current]
        path.append(current)
    
    return path[::-1]

def find_longest_path(graph, source, target):
    inverted_graph = Graph()
    for node in graph.nodes:
        inverted_graph.add_node(node)
    
    max_weight = max(graph.distances.values()) + 1 if graph.distances else 11
    
    for (from_node, to_node), weight in graph.distances.items():
        if from_node < to_node:
            inverted_weight = max_weight - weight
            inverted_graph.add_edge(from_node, to_node, inverted_weight)
    
    distances, paths = dijkstra(inverted_graph, source, target)
    
    return get_shortest_path(source, target, paths)

class GraphCanvas(QWidget):
    def __init__(self, parent):
        super().__init__(parent)
        self.parent = parent
        self.dijkstra_results = None
        self.shortest_path = None
        self.longest_path = None
    
    def paintEvent(self, event):
        painter = QPainter(self)
        painter.setRenderHint(QPainter.RenderHint.Antialiasing)
        for node, neighbors in self.parent.graph.edges.items():
            for neighbor in neighbors:
                if node < neighbor:
                    start_x, start_y = self.parent.node_positions[node]
                    end_x, end_y = self.parent.node_positions[neighbor]
                    
                    painter.setPen(QPen(Qt.GlobalColor.black, 2))
                    painter.drawLine(start_x, start_y, end_x, end_y)
                    
                    weight = self.parent.graph.distances.get((node, neighbor), "")
                    mid_x = (start_x + end_x) / 2
                    mid_y = (start_y + end_y) / 2
                    painter.setPen(QPen(Qt.GlobalColor.blue, 2))
                    painter.drawText(QPoint(round(mid_x), round(mid_y)), str(weight))
        
        if self.shortest_path and len(self.shortest_path) > 1:
            for i in range(len(self.shortest_path) - 1):
                current = self.shortest_path[i]
                next_node = self.shortest_path[i + 1]
                
                start_x, start_y = self.parent.node_positions[current]
                end_x, end_y = self.parent.node_positions[next_node]
                
                painter.setPen(QPen(Qt.GlobalColor.red, 3))
                painter.drawLine(start_x, start_y, end_x, end_y)

        if self.longest_path and len(self.longest_path) > 1:
            for i in range(len(self.longest_path) - 1):
                current = self.longest_path[i]
                next_node = self.longest_path[i + 1]
                
                start_x, start_y = self.parent.node_positions[current]
                end_x, end_y = self.parent.node_positions[next_node]
            
                painter.setPen(QPen(QColor(128, 0, 128), 3, Qt.PenStyle.DashLine))
                painter.drawLine(start_x, start_y, end_x, end_y)
        

        for node, (x, y) in self.parent.node_positions.items():
            if node in self.parent.selected_nodes:
                painter.setBrush(QColor(255, 200, 0))  # Selected node
            elif self.shortest_path and node == self.shortest_path[0] and self.longest_path and node == self.longest_path[0]:
                painter.setBrush(QColor(0, 255, 0))  # Source node (both paths)
            elif self.shortest_path and node == self.shortest_path[-1] and self.longest_path and node == self.longest_path[-1]:
                painter.setBrush(QColor(255, 0, 0))  # Destination node (both paths)
            elif self.shortest_path and node == self.shortest_path[0]:
                painter.setBrush(QColor(0, 255, 0))  # Source node (shortest)
            elif self.shortest_path and node == self.shortest_path[-1]:
                painter.setBrush(QColor(255, 0, 0))  # Destination node (shortest)
            elif self.longest_path and node in self.longest_path and self.shortest_path and node in self.shortest_path:
                painter.setBrush(QColor(255, 100, 255))  # Node in both paths
            elif self.shortest_path and node in self.shortest_path:
                painter.setBrush(QColor(255, 150, 150))  # Node in shortest path
            elif self.longest_path and node in self.longest_path:
                painter.setBrush(QColor(180, 100, 255))  # Node in longest path
            else:
                painter.setBrush(QColor(200, 200, 255))  # Regular node
            
            painter.setPen(QPen(Qt.GlobalColor.black, 2))
            painter.drawEllipse(x - 15, y - 15, 30, 30)

            painter.setPen(QPen(Qt.GlobalColor.black, 2))
            painter.setFont(QFont("Arial", 10))
            painter.drawText(QPoint(x - 5, y + 5), str(node))
    
    def mousePressEvent(self, event):
        x, y = event.position().x(), event.position().y()
        
        if self.parent.mode == "connect_nodes":
            clicked_node = self.parent.get_node_at(x, y)
            
            if clicked_node is not None:
                if clicked_node in self.parent.selected_nodes:
                    self.parent.selected_nodes.remove(clicked_node)
                    self.parent.status_label.setText(f"Node {clicked_node} unselected.")
                else:
                    self.parent.selected_nodes.append(clicked_node)
                    self.parent.status_label.setText(f"Node {clicked_node} selected.")
                    
                if len(self.parent.selected_nodes) == 2:
                    node1, node2 = self.parent.selected_nodes
                    weight = random.randint(1, 10)
                    self.parent.add_edge_between(node1, node2, weight)
                    self.parent.status_label.setText(f"Se añadio arista desde {node1} a {node2} con peso {weight}.")
                    self.parent.selected_nodes = []
                
                self.update()

class DijkstraApp(QWidget):
    def __init__(self):
        super().__init__()
        self.graph = Graph()
        self.node_positions = {}
        self.next_node_id = 0
        self.selected_nodes = []
        self.mode = "none"
        
        self.setWindowTitle('Dijkstra Algorithm Visualizer')
        self.setGeometry(100, 100, 800, 600)
        
        layout = QVBoxLayout()
        controls_layout = QGridLayout()
        
        self.add_node_btn = QPushButton("Añadir Nodo")
        self.add_node_btn.clicked.connect(self.add_random_node)
        
        self.connect_nodes_btn = QPushButton("Conectar Nodos")
        self.connect_nodes_btn.clicked.connect(self.on_connect_nodes)
        
        self.run_dijkstra_btn = QPushButton("Dijkstra")
        self.run_dijkstra_btn.clicked.connect(self.run_dijkstra)
        
        controls_layout.addWidget(self.add_node_btn, 0, 0)
        controls_layout.addWidget(self.connect_nodes_btn, 0, 1)
        controls_layout.addWidget(self.run_dijkstra_btn, 0, 2)
        
        self.status_label = QLabel("")
        controls_layout.addWidget(self.status_label, 1, 0, 1, 3)
        
        self.canvas = GraphCanvas(self)
        
        layout.addLayout(controls_layout)
        layout.addWidget(self.canvas)
        
        self.setLayout(layout)
    
    def add_random_node(self):
        if self.next_node_id >= 26:
            self.status_label.setText("Numero maximo de nodos alcanzado.")
            return
        
        node_id = chr(65 + self.next_node_id)
    
        margin = 50 
        x = random.randint(margin, self.canvas.width() - margin)
        y = random.randint(margin, self.canvas.height() - margin)
        
        self.graph.add_node(node_id)
        self.node_positions[node_id] = (x, y)
        self.next_node_id += 1
        
        self.status_label.setText(f"Nodo {node_id} añadido")
        self.canvas.update()
    
    def on_connect_nodes(self):
        if len(self.graph.nodes) < 2:
            self.status_label.setText("Se necesitan minimo 2 nodos para conectar")
            return
        
        self.mode = "connect_nodes"
        self.selected_nodes = []
        self.status_label.setText("Dale click a 2 nodos para conectarlos.")
    
    def run_dijkstra(self):
        if len(self.graph.nodes) < 2:
            self.status_label.setText("Se necesitan minimo 2 nodos para ejecutar")
            return
            
        node_names = sorted(list(self.graph.nodes))
        
        start_node, ok1 = QInputDialog.getItem(
            self, "", "Selecciona el nodo inicial:", node_names, 0, False
        )
        
        if not ok1:
            return
        
        end_node, ok2 = QInputDialog.getItem(
            self, "", "Selecciona el nodo final:", node_names, 0, False
        )
        
        if not ok2:
            return
            
        if start_node == end_node:
            self.status_label.setText("El nodo inicial y final no pueden ser el mismo.")
            return
        

        distances, paths = dijkstra(self.graph, start_node, end_node)
        short_path = get_shortest_path(start_node, end_node, paths)
        long_path = find_longest_path(self.graph, start_node, end_node)
        
        if not short_path and not long_path:
            self.status_label.setText(f"No existe camino entre el nodo {start_node} y {end_node}.")
            self.canvas.shortest_path = None
            self.canvas.longest_path = None
        else:
            status = []
            
            if short_path:
                total_distance = distances[end_node]
                path_str = " → ".join(short_path)
                status.append(f"Camino mas corto: {path_str}, Distancia total: {total_distance}")
                self.canvas.shortest_path = short_path
            else:
                self.canvas.shortest_path = None
                
            if long_path:
                long_distance = 0
                for i in range(len(long_path) - 1):
                    long_distance += self.graph.distances[(long_path[i], long_path[i+1])]
                path_str = " → ".join(long_path)
                status.append(f"Camino mas largo: {path_str}, Distancia total: {long_distance}")
                self.canvas.longest_path = long_path
            else:
                self.canvas.longest_path = None
                
            self.status_label.setText(" | ".join(status))
            
        self.canvas.update()
    
    def add_edge_between(self, node1, node2, weight=1):
        self.graph.add_edge(node1, node2, weight)
        self.canvas.update()
    
    def get_node_at(self, x, y, tolerance=20):
        for node, pos in self.node_positions.items():
            node_x, node_y = pos
            distance = ((node_x - x) ** 2 + (node_y - y) ** 2) ** 0.5
            if distance <= tolerance:
                return node
        return None

def main():
    app = QApplication(sys.argv)
    window = DijkstraApp()
    window.show()
    sys.exit(app.exec())

if __name__ == "__main__":
    main()