package ua.lpnuai.oop.hetman12;

import java.util.ArrayList;
import java.util.Date;

public class Item {
    private String Name = "";
    private String Last_Name = "";
    private String Email = "";
    private int quantity = 0;
    private String unit = "";
    private ArrayList<String> specification = new ArrayList<String>();
    private Double price;
    private String timestamp;

    public Item(){
        Date date = new Date();
        timestamp = date.toString();
    }

    public void addSpec(String s){
        specification.add(s);
    }

    public String Info(){
        String res = "Name: " + getName() + "\n" +
                "Email: " + getLast_Name()+ "\n" +
                "Price: " + getPrice() + "\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Delivery time: " + getTimestamp() + "\n";
        for (String e: specification
                ) {
            res +=  e + "\n";
        }
        return res;
    }


    public String getName() {
        return Name;
    }
    public void setName(String s) {
        Name = s;
    }

    public String getLast_Name() {
        return Last_Name;
    }
    public void setLast_Name(String s) {
        Last_Name = s;
    }


    public String getPrice() {
        return Double.toString(price) + " UAH";
    }

    public void setPrice(Double i) {
        price = i;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void ResetTimestamp() {
        Date date = new Date();
        timestamp = date.toString();
    }

    public void setUnit(String u) {
        unit = u;

    }

    public String getQuantity() {
        return Integer.toString(quantity) + " " + unit;
    }

    public void setQuantity(int i) {
        quantity = i;
    }
}
