public class CashRegister {
    private double purchase; // จํานวนเงินรวมของสินค้าที่ซื้อ
    private double payment; // จํานวนเงินรวมที่ลูกค้าจ่าย
    private  TaxCalculator calculator;
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }
    public void setTaxCalculator(TaxCalculator calculator){
        this.calculator = calculator;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }
    public void calculateTax() {
        purchase = purchase + calculator.cal(purchase);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}