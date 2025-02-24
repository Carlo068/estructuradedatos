/** Carlo Alejandro Ruiz OLvera
* 14961
* fecha 24/02/2025
*/

public class GradeCalculationPartial{
    public double calculate(int partialgrade, int homeworkscore) {
        double finalgrade = partialgrade * 0.7 + homeworkscore * 0.3;
        return finalgrade;
    }
}