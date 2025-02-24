public class GradeCalculationPartial{
    public double calculate(int partialgrade, int homeworkscore) {
        double finalgrade = partialgrade * 0.7 + homeworkscore * 0.3;
        return finalgrade;
    }
}