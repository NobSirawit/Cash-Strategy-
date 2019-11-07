public class TaxCalThai implements TaxCalculator {
    @Override
    public double cal(double purchase) {
        return purchase*0.07;
    }
}
