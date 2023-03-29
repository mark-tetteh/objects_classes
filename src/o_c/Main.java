package o_c;

import objects_classes.BondTrades;
import objects_classes.FundTrades;
import objects_classes.Trade1;
import objects_classes.Trader1;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
//        System.out.print("Please enter your age :");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        System.out.println(input + " 8is your age");

        BondTrades fund = new BondTrades("F1", "fff", 10, 10.0, 5);
        System.out.println(fund.toString());

=======

          Trade1 t1 = new Trade1("T1", "APPL", 100, 15.25);
          Trade1 t2 = new Trade1("T1", "APPL", 10, 15.0);

          Trader1 T1 = new Trader1();

            T1.addTrade(t1);
            T1.addTrade(t2);

          T1.displayAccount();
>>>>>>> 73fd3345ae9b4ed93944db8d47347bf16bcaa32c

        }
    }

