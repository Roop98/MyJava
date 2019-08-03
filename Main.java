package ee.sdacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any value:");
        double bignum = scan.nextFloat();

        double rou = roundwithdecimalplace(bignum,2);
        System.out.println(rou);



    }
    public static double roundwithdecimalplace(Double val, long places)
    {
        int fac = 100;
        return Math.round(val*fac)/(double)fac;
    }
}
