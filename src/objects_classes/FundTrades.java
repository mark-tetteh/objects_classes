package objects_classes;

public class FundTrades extends Trade1 {

    private final float dividendPercentage;
    private double dividend ;

    public FundTrades(String ID, String symbol, int quantity, double price, float dividendPercentage) {
        super(ID, symbol, quantity, price);
        this.dividendPercentage = dividendPercentage;
    }


    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    @Override
    public void calcDividend() {
         dividend = (this.dividendPercentage/100) * this.getPrice();
        System.out.printf("%.2f\n", dividend);
    }

    @Override
    public String toString() {
        return "FundTrades{" + super.toString() +
                "dividendPercentage= " + dividendPercentage +
                ", dividend=" + dividend +
                '}';
    }
}
