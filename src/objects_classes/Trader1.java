package objects_classes;

public class Trader1 {
    private String name ;
    private Account1 account1;


    public Trader1(){
        account1 = new Account1();

    }

    public void addTrade(Trade1 trade1){

        double values = trade1.getPrice() * trade1.getQuantity() ;
        account1.setTotalValuesOfTrades(values);
    }

    public void displayAccount() {
        System.out.println(account1.getTotalValuesOfTrades());
    }


}
