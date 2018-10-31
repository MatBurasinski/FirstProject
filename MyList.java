package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private ArrayList myList = new ArrayList<>();

    public void addItem(MyObject myObject){
        myList.add(myObject);
    }

    public List getMyList() {
        return myList;
    }

}
