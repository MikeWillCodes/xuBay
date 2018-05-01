package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;


public class ItemList {
    private Item head;
    private  ItemList next;

    public ItemList(Item head) {
        this.head = head;
        this.next = null;
    }

    public ItemList(int data){
        ArrayList<Integer> xulaID = new ArrayList<>();
        xulaID.add(900199950);
        xulaID.add(900196650);
        xulaID.add(900537450);
        xulaID.add(900197800);
        xulaID.add(900675843);
        xulaID.add(900198767);
        xulaID.add(900177750);
        xulaID.add(900194320);
        xulaID.add(900121110);

        ArrayList<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Jacob");
        names.add("Sam");
        names.add("Akin");
        names.add("Prince");
        names.add("Vivian");
        names.add("Marc");
        names.add("Mike");
        names.add("Cory");
        names.add("Ethan");
        names.add("Tiara");
        Random rand = new Random();
        for (int i = 0; i < data; i++) {
            this.head = new Item(xulaID.get(rand.nextInt(9)), names.get(rand.nextInt(11)),
                    rand.nextInt(100),rand.nextInt(10), LocalDate.now().plusDays(rand.nextInt(5)));
            this.append(head);
        }
    }

    public void append( Item item){
        ItemList temp = this;
        while (temp.next != null)
            temp = temp.next;
        temp.next = new ItemList(item);
    }


    public ItemList prepend(Item item){
        ItemList temp = new ItemList(item);
        temp.next = this;
        return temp;
    }

//    public ItemList add(Item item){
//
//    }
//
//    public  ItemList size(){
//
//    }
//
//    public ItemList get(Item item){
//
//    }
//
//    public ItemList set(int index, Item item){
//
//    }

    @Override
    public String toString() {
        return "ItemList{" +
                "head=" + head +
                ", next=" + next +
                '}';
    }
}
