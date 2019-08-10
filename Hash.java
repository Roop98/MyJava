package ee.sdacademy;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

public class Hash {

    String name;
    double price;

    HashMap<String, Double> hashi = new HashMap<>();

    protected boolean ask() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What operation you want [Add/Remove/Done/Search/View]:");
            String operator = scan.next();
            if (operator.equalsIgnoreCase("add")) {
                add();
            }
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
        return true;
    }

    protected boolean add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What item you want to add");
        name = scan.nextLine();
        System.out.println("Price for that item:");
        price = scan.nextDouble();
        hashi.put(name, price);
        return true;
    }

    protected boolean remove() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What item to be removed:");
        String rem = scan.next();
        Iterator<Entry<String, Double>> iterator = hashi.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Double> entry = iterator.next();
            if (entry.getKey().equalsIgnoreCase(rem)) {
                iterator.remove();
            }
        }
        System.out.println("Available products left in the cart are:" + hashi);
        return true;
    }

    protected boolean view() {
        System.out.println(hashi);
        return true;
    }

    protected boolean search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What item you want to search:");
        String ser = scan.next();

        Iterator<Entry<String, Double>> iterator = hashi.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Double> en = iterator.next();
            if (en.getKey().equalsIgnoreCase(ser)) {
                if (ser.matches(name)) {
                    System.out.println(name);
                    System.out.println(price);
                }
            }
        }
        return true;
    }
}
