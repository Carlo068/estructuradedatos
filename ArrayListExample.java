import java.util.ArrayList;

public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<String>();
    public void addCars(String car) {
        // Se agregan elementos al ArrayList
        cars.add(car);

        // Se imprime el ArrayList
        System.out.println(cars);
    }
    public void removeCars(int index) {
        // Se remueve un elemento del ArrayList
        cars.remove(index);

        // Se imprime el ArrayList
        System.out.println(cars);
    }
}
