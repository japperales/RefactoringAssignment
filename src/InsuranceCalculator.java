public class InsuranceCalculator {

    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return calculateInsuranceVeryLow(income, 0.365);
        } else if (income <= 30000) {
            return calculateInsuranceLow(income, 10000, 0.2, 35600);
        } else if (income <= 60000) {
            return calculcateInsuranceHigh(income, 30000, 0.1, 76500);
        } else {
            return insuranceStrategyVeryHigh.CalculateInsuranceVeryHigh(income);
        }
    }

    private double calculcateInsuranceHigh(double income, int i, double v, int i2) {
        return (income - i) * v + i2;
    }

    private double calculateInsuranceLow(double income, int i, double v, int i2) {
        return (income - i) * v + i2;
    }

    private double calculateInsuranceVeryLow(double income, double v) {
        return income * v;
    }

    private double CalculateInsuranceVeryHigh(double income) {
        return insuranceStrategyVeryHigh.CalculateInsuranceVeryHigh(income);
    }
    public int getConstant() {
        return insuranceStrategyVeryHigh.getConstant();
    }

    public double getWeight() {
        return insuranceStrategyVeryHigh.getWeight();
    }
    public int getAdjustment() {
        return insuranceStrategyVeryHigh.getAdjustment();
    }

}
