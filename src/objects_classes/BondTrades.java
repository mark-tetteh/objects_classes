package objects_classes;

public class BondTrades extends Trade1{
     private final double dividend ;
    public BondTrades(String ID, String symbol, int quantity, double price, double dividend) {
        super(ID, symbol, quantity, price);
        this.dividend = dividend;
    }

    public double getDividend() {
        return dividend;
    }

    @Override
    public void calcDividend() {

        System.out.println("The bond Trade is " + dividend) ;
    }

    @Override
    public String toString() {
        return "BondTrades{" + super.toString() +
                "dividend=" + dividend +
                '}';
    }
}
