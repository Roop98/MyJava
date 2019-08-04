package ee.sdacademy;
import java.util.Scanner;
public class Space2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = scan.nextInt();
        System.out.println("Enter another number:");
        double number2 = scan.nextDouble();
        double num3 = divide(number1, number2);
        double rou = roundwithdecimalplace(num3, 4);
        System.out.println(rou);
    }

    public static double divide(int num1, double num2) {

        return num1/num2;
    }

    public static double roundwithdecimalplace(double val, long places) {
        long fac = (long) Math.pow(10, places);
        return Math.round(val * fac) / (double) fac;
    }

}
