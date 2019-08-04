package ee.sdacademy;

import java.util.Scanner;

public class Today5 {

    protected int add(int num1, int num2) {
        return num1 + num2;
    }

    protected boolean maxnum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = scan.nextInt();
        System.out.println("Enter another number:");
        int number2 = scan.nextInt();
        int max = 20;
        if (add(number1, number2) <= max) {
            System.out.println(add(number1, number2));
        } else {

            System.out.println("Number is bigger than maximum");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int one = Integer.MAX_VALUE;
        int two = Integer.MIN_VALUE;
        System.out.println(one);
        System.out.println(two);
        int result = one + two;
        System.out.println(result);
        Today5 today5 = new Today5();
        today5.maxnum();
    }
}
