package ee.sdacademy;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

public class Hash2 {

    protected String name;
    protected int age;
    protected String species;
}

class Hash3 {

    protected Hash2 hash2 = new Hash2();
    protected HashMap<String, Integer> ha = new HashMap<>();
    protected HashMap<String, Integer> ha1 = new HashMap<>();

    protected boolean list() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What operation you want to do [Add/Remove/View/Done]:");
            String operation = scan.next();
            if (operation.equalsIgnoreCase("add"))
                add();
            if (operation.equalsIgnoreCase("remove"))
                remove();
            if (operation.equalsIgnoreCase("view"))
                view();
            if (operation.equalsIgnoreCase("done")) {
                System.out.println("operation done");
                break;
            }
        }
        return true;
    }

    protected void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of dog:");
        hash2.name = scan.nextLine();
        System.out.println("Enter age of dog:");
        hash2.age = scan.nextInt();
        System.out.println("Enter species of dog:");
        hash2.species = scan.nextLine();
        ha.put(hash2.name, hash2.age);
        ha1.put(hash2.species, hash2.age);
    }

    protected void view() {
        System.out.println("Dogs with name and age and species:" + ha + ha1);
    }

    protected void remove() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which dog, you want to remove:");
        String dogname = scan.next();
        Iterator<Entry<String, Integer>> iterator = ha.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> roop = iterator.next();
            if (roop.getKey().equalsIgnoreCase(dogname)) {
                iterator.remove();
            }
        }
        System.out.println("Dogs left in the cart:" + ha);
    }
}

class Hash4 {

    public static void main(String[] args) {
        Hash3 hash3 = new Hash3();
        hash3.list();
    }
}
