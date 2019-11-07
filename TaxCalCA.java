public class TaxCalCA implements TaxCalculator {
    @Override
    public double cal(double purchase) {
        return purchase*0.075;
    }
}
