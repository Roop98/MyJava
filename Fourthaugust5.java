package ee.sdacademy;

import java.util.Scanner;

public class Fourthaugust5 {

    int value;

    protected double divide() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value:");
        value = scan.nextInt();
        while (value != 0) {
            if (value == 0) {
                System.out.println("Wrong value");
                break;
            }
            System.out.println("Enter another value:");
            double value1 = scan.nextInt();
            double div = value / value1;
            System.out.println(round(div,4));

        }
        value++;
        return divide();
    }

    protected double round(double val,long places) {
        int fac = 10000;
        return Math.round(val * fac) / (double) fac;
    }

    public static void main(String[] args) {

        Fourthaugust5 fourthaugust5 = new Fourthaugust5();
        fourthaugust5.divide();
    }
}

