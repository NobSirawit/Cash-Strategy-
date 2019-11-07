public class TaxCalNY implements TaxCalculator {
    @Override
    public double cal(double purchase) {
        if(purchase>100){
            return purchase*0.08;
        }
        return 0;
    }
}
