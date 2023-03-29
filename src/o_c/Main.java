package o_c;

import o_c.objects_classes.Trade1;
import o_c.objects_classes.Trader1;

public class Main {
    public static void main(String[] args) {

//        System.out.print("Please enter your age :");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        System.out.println(input + " 8is your age");
          Trade1 t1 = new Trade1("T1", "APPL", 100, 15.25);
          Trade1 t2 = new Trade1("T1", "APPL", 10, 15.0);
//
          Trader1 T1 = new Trader1();
//
            T1.addTrade(t1);
            T1.addTrade(t2);
//
          T1.displayAccount();

        }
    }

