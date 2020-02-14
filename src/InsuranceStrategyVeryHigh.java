public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    double CalculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public int getConstant() {
        return 105600;
    }

    public double getWeight() {
        return 0.02;
    }

    public int getAdjustment() {
        return 60000;
    }
}