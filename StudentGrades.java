/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 11/02/2025
*/
public class StudentGrades {
    public int calculatePartialGrade(int examScore, int homeworkScore){
        // se calcula la calificacion del parcial
        int partialGrade = (int)((examScore*0.7)+(homeworkScore*0.3));
        return partialGrade;
    }
    public int calculateFinalGrade(int firtPartialGrade, int secondPartialGrade, int thirdPartialGrade ,int finalExam){
        // se calcula la calificacion final del semestre
        int finalGrade = (int)(((((firtPartialGrade)+(secondPartialGrade)+(thirdPartialGrade))/3)*0.5)+(finalExam*0.5));
        return finalGrade;
    }
    public String checkFailureByAbcenses(int totalHours, int absences){
        // se verifica el estatus de asistencia
        float absencepercent = (absences/(float)totalHours)*100;
        // si el porcentaje de faltas es menor a 10 se imprime que el alumno cumple con las asistencias minimas
        if (absencepercent < 10){
            return "Alumno cumple con las asistencias minimas";
        }
        else {
            return "Alumno no cumple con las asistencias minimas";
        }
    }
}
