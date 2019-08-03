package ee.sdacademy;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any value:");
        double bignum = scan.nextFloat();

        double rou = roundwithdecimalplace(bignum,3);
        System.out.println(rou);



    }
    public static double roundwithdecimalplace(Double val, long places)
    {
        long fac = (long)Math.pow(10,places);
        return Math.round(val*fac)/(double)fac;
    }

    }

