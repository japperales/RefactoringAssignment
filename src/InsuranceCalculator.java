public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyVeryLow();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculateInsuranceVeryHigh(income);
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
        return strategy.calculateInsuranceVeryHigh(income);
    }
    public int getConstant() {
        return strategy.getConstant();
    }

    public double getWeight() {
        return strategy.getWeight();
    }
    public int getAdjustment() {
        return strategy.getAdjustment();
    }

}
