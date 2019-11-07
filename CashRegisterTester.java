public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        register.recordPurchase(60);
        register.recordPurchase(40);

        String state = "CA";//สมมติให้เรียกจาก API ตัวอื่น

        if(state.equals("CA")){
            register.setTaxCalculator(new TaxCalCA() );
        }
        else if(state.equals("NY")){
            register.setTaxCalculator(new TaxCalNY()) ;
        }
        else {
            register.setTaxCalculator(new TaxCalThai());
        }
        register.calculateTax();


        register.enterPayment(200);
        double change = register.giveChange();
        System.out.println(change);
    }
}
