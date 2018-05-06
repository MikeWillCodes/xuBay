package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nWelcome to XUBay\n");

        ItemList items = new ItemList(5);
        System.out.println("Is Item List empty?: " + items.isEmpty());
        System.out.println("The size of listings: " + items.size());
        System.out.println("Get [index]: " + items.get(4));
        System.out.println("Listings: " + items);


    }
}
