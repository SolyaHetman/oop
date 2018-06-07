package ua.lpnuai.oop.hetman12;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program started!");
        String in;

        Store store = new Store();

        while(true){
            in = sc.nextLine();
            switch(in.toLowerCase()){

                case "-add":
                case "--add":
                    store.addItem();
                    break;


                case "-r":
                case "--remove":
                    store.removeItem();
                    break;

                case "-l":
                case "--list":
                    store.List();
                    break;

                case "-e":
                case "--exit":
                    System.out.println("Bye, bye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong command!");
                    break;
            }
        }
    }
}