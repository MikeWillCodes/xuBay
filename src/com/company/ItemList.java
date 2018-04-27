package com.company;

import java.util.ArrayList;

public class ItemList {
    private Item head;
    private  ItemList next;

    public ItemList(Item head) {
        this.head = head;
        this.next = null;
    }

    public ItemList(int data){
        ArrayList<>
    }

    public ItemList prepend(Item item){
        ItemList temp = new ItemList(item);
        temp.next = this;
        return temp;
    }

    public ItemList add(Item item){

    }

    public  ItemList size(){

    }

    public ItemList get(Item item){

    }

    public ItemList set(int index, Item item){

    }

    @Override
    public String toString() {
        return "ItemList{" +
                "head=" + head +
                ", next=" + next +
                '}';
    }
}
