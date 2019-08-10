package ee.sdacademy;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

    //In this class we initialize variable with ultimate protection
    protected String name;
    protected int age;
    protected String species;
}

class Function {
    //Creating instance of previous class and initialiazing linked list function
    protected Linkedlist linkedlist = new Linkedlist();
    protected List<String> list = new LinkedList<>();
    protected List<Integer> li = new LinkedList<>();
    protected List<String> l = new LinkedList<>();

    protected void finallist() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What operation you want to do [Add/Remove/View/Search/Done]:");
            String op = scan.next();
            if (op.equalsIgnoreCase("add"))
                add();
            if (op.equalsIgnoreCase("remove"))
                remove();
            if (op.equalsIgnoreCase("search"))
                search();
            if (op.equalsIgnoreCase("view"))
                view();
            if (op.equalsIgnoreCase("done")) {
                System.out.println("operation done");
                break;
            }
        }
    }

    protected void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of dog:");
        linkedlist.name = scan.nextLine();
        System.out.println("Enter age of dogs:");
        linkedlist.age = scan.nextInt();
        System.out.println("Enter species of dogs:");
        linkedlist.species = scan.next();
        list.add(linkedlist.name);
        li.add(linkedlist.age);
        l.add(linkedlist.species);
    }

    protected void view() {
        for (String ad : list)
            System.out.println(ad);
        for (int num : li)
            System.out.println(num);
        for (String sp : l)
            System.out.println(sp);
    }

    protected void remove() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which dog you want to remove:");
        String rem = scan.next();
        for (String j : list) {
            if (j.equalsIgnoreCase(rem)) {
                System.out.println("Name of the removed dog is:" + list.remove(j));
                System.out.println(j);
            }
        }

    }

    protected void search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which dog you want to search:");
        String ser = scan.next();
        for (String i : list) {
            if (i.equalsIgnoreCase(ser)) {
                System.out.println("Searched dog is : " + i);
            }
        }
    }
}

class result {

    public static void main(String[] args) {
        Function function = new Function();
        function.finallist();
    }

}
