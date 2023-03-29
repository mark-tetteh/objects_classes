package o_c;

import objects_classes.BondTrades;
import objects_classes.FundTrades;
import objects_classes.Trade1;
import objects_classes.Trader1;

public class Main {
    public static void main(String[] args) {

//        System.out.print("Please enter your age :");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        System.out.println(input + " 8is your age");

        BondTrades fund = new BondTrades("F1", "fff", 10, 10.0, 5);
        System.out.println(fund.toString());


        }
    }

