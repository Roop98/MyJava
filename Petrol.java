package ee.sdacademy;

import java.util.ArrayList;
import java.util.Scanner;

public class Petrol {

    float litre;
    float money;
    float fuelamt;
}

class Addpetrol {
    Petrol petrol = new Petrol();

    protected void addfuel() {
        Scanner scan = new Scanner(System.in);
        petrol.fuelamt = 0;
        float standardamt = 1.23f;
        while (true) {

            System.out.println("Would you like to buy fuel [Yes/No]:");
            String buy = scan.next();
            if (buy.equalsIgnoreCase("yes")) {
                System.out.println("How many litres you want:");
                petrol.litre = scan.nextFloat();
                petrol.fuelamt += petrol.litre;
            } else {
                System.out.println("operation finished");
                System.out.println("You bought " + petrol.fuelamt + "l of petrol");
                petrol.money = petrol.fuelamt * standardamt;
                System.out.println("Please pay: " + petrol.money + "$");
                paymoney();
                break;
            }
        }
    }

    protected void paymoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please pay " + petrol.money + "required amount: ");
        float pay = scan.nextFloat();
        if (pay == petrol.money)
            System.out.println("User paid the amount");
        if (pay > petrol.money) {
            float leftover = pay - petrol.money;
            System.out.println("You paid extra amount of " + leftover + " amount");
        }
        if (pay < petrol.money) {
            float lef = petrol.money - pay;
            System.out.println("Please pay the left over " + lef + "$");
            float rem = scan.nextFloat();
        }
    }
}

class cmon {
    public static void main(String[] args) {
        Addpetrol addpetrol = new Addpetrol();
        addpetrol.addfuel();
    }
}
