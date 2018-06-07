package ua.lpnuai.oop.hetman12;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    private ArrayList<Item> items = new ArrayList<Item>();

    public void List(){
        if (items.size() == 0) {
            System.out.println("Store is empty!");
        } else {
            int c = 0;
            for (Item i: items
                    ) {
                System.out.println("id: " + Integer.toString(c++));
                System.out.println(i.Info());
            }
        }
    }

    public void removeItem(){
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        items.remove(i);
    }


    public void addItem(){
        Item item = new Item();

        Scanner sc = new Scanner(System.in);
        String in;

        System.out.println("Enter item name:");
        in = sc.nextLine();

        while (!in.matches("^(?!\\s*$).+")) {
            System.out.println("Enter valid name:");
            in = sc.nextLine();
        }
        item.setName(in);

        System.out.println("Enter item  email:");
        in = sc.nextLine();

        while (!in.matches("[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))")) {
            System.out.println("Enter valid  email:");
            in = sc.nextLine();
        }
        item.setLast_Name(in);


        System.out.println("Enter item price:");
        in = sc.nextLine();
        while (!in.matches("^\\d+(\\.\\d+)?")) {
            System.out.println("Enter valid price:");
            in = sc.nextLine();
        }

        item.setPrice(Double.parseDouble(in));

        System.out.println("Enter item unit:");
        item.setUnit(sc.nextLine());

        System.out.println("Enter item quantity:");


        in = sc.nextLine();
        while (!in.matches("^\\d+")) {
            System.out.println("Enter valid quantity:");
            in = sc.nextLine();
        }

        item.setQuantity(Integer.parseInt(in));

        while (true) {

            System.out.println("Toe exit enter ~");
            System.out.println("Add specification:");
            in = sc.nextLine();
            if (in.equals("~")) {
                break;
            } else {
                item.addSpec(in);
            }

        }
        items.add(item);
    }
}
