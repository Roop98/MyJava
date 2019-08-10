package ee.sdacademy;

import java.util.Scanner;
import java.util.ArrayList;

public class Listing {

    protected String name;
    protected int age;
    protected String species;

    ArrayList<String> arrayLis = new ArrayList<>();
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<String> ar = new ArrayList<>();

    protected void list() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What operation you want to perform [Add/View/Search/Done]:");
            String operator = scan.next();
            if (operator.equalsIgnoreCase("add"))
                add();
            if (operator.equalsIgnoreCase("remove"))
                remove();
            if (operator.equalsIgnoreCase("view"))
                view();
            if (operator.equalsIgnoreCase("search"))
                search();
            if (operator.equalsIgnoreCase("done")) {
                System.out.println("operation done");
                break;
            }
        }
    }

    protected void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of dog:");
        name = scan.nextLine();
        System.out.println("Enter age of dog:");
        age = scan.nextInt();
        System.out.println("Enter species of dog:");
        species = scan.nextLine();
        arrayLis.add(name);
        arr.add(age);
        ar.add(species);
    }

    protected void view() {
        System.out.println("List of dog names are:");
        for (String i : arrayLis) {
            System.out.println(i);
        }
        System.out.println("List of dog ages are:");
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println("List of dog names are:");
        for (String k : ar) {
            System.out.println(k);
        }
    }

    protected void search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which dog you want to search:");
        String nam = scan.next();
        for (int i = 0; i < arrayLis.size(); i++) {
            if (arrayLis.get(i).equalsIgnoreCase(nam)) {
                System.out.println("Searched dog is: " + arrayLis.get(i));
                System.out.println("Age of searched dog is: " + arr.get(i) );
            }
        }
    }
    protected void remove()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which dog you want to remove:");
        String rem = scan.next();
        for (int j = 0;j<arrayLis.size();j++)
        {
            if (arrayLis.get(j).equalsIgnoreCase(rem))
            {
                System.out.println("Removed name of dog is: " + arrayLis.remove(j));
                System.out.println("Age of the removed dog is: " + arr.remove(j));
            }
        }
    }
}

class Arraylist1 {

    public static void main(String[] args) {

        Listing listing = new Listing();
        listing.list();
    }
}
