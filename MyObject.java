package com.company;

import java.util.ArrayList;

public class MyObject {
    private int size;
    private int weight;
    private String name;
   private ArrayList<MyObject> myObjects;

    public ArrayList<MyObject > getMyObjects() {
        return myObjects;
    }

    //
    public MyObject(int size, int weight, String name) {
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    public void addItem(MyObject myObject){
        myObjects.add(myObject);
    }
}
