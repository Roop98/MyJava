package ee.sdacademy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class Stackexample1 {

    Stack<String> stacknames = new Stack<>();
    private String[] name = new String[5];
    protected void add() {
        Scanner scan = new Scanner(System.in);
        for (int i =0;i<name.length;i++)
        {
            System.out.println("Enter String " + i +" :");
            name[i] = scan.nextLine();
            stacknames.push(name[i]);
        }
        System.out.println(stacknames);
    }
}
class print{
    public static void main(String[] args) {
        Stackexample1 stackexample1 = new Stackexample1();
        stackexample1.add();
    }
}
