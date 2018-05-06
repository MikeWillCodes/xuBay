package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nWelcome to XUBay\n");

        ItemList items = new ItemList(5);

        Item sell = new Item(900199999,"Nate",
                50,2, LocalDate.now().plusDays(3));
        System.out.println("New Seller: " + sell);

        System.out.println("Is Item List empty?: " + items.isEmpty());

        System.out.println("The size of listings: " + items.size());

        System.out.println("Get [index]: " + items.get(4));

        System.out.println("Listings: " + items);


    }
}
