package objects_classes;

public abstract class Trade1 {
    private String ID;
    private String symbol;
    private int quantity;
    private double price ;

    public Trade1(String ID, String symbol, int quantity, double price){

        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }
    Trade1(String ID , String symbol , int quantity ){

        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if(price < 0){
            return;
        }
        this.price = price;
    }


    public abstract void calcDividend();

    @Override
    public String toString() {
        return "Trade1{" +
                "ID='" + ID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price + " "
                ;
    }
}
