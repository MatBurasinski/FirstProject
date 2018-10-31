package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		ArrayList<MyObject> list = new ArrayList<>();



	MyObject myObject = new MyObject(1,294,"chair");
	MyObject myObject2 = new MyObject(41,268,"chair");
	MyObject myObject3= new MyObject(12,424,"leg");
	MyObject myObject4 = new MyObject(61,241,"laptop");
	MyObject myObject5 = new MyObject(991,24,"sword");

	list.add(myObject);
	list.add(myObject2);
	list.add(myObject3);
	list.add(myObject4);
	list.add(myObject5);


	for (int i = 0; i <list.size(); i++){
		System.out.println(list.get(i).getWeight());}

//		myObject.addItem(myObject);
//		myObject.addItem(myObject2);
//		myObject.addItem(myObject3);
//		myObject.addItem(myObject4);
//		myObject.addItem(myObject5);
//
//		for (int i =0; i<myObject.getMyObjects().size(); i++){
//			System.out.println(myObject.getMyObjects());
//		}

//	newMyList.addItem(myObject);
//	newMyList.addItem(myObject2);
//	newMyList.addItem(myObject3);
//	newMyList.addItem(myObject4);
//	newMyList.addItem(myObject5);
//
////
//	myObject.getName();
//
//
//
//       for(int i =0; i<newMyList.getMyList().size(); i++){
//       	System.out.println(newMyList.getMyList().get(2).getClass().);
//		   }
    }
}
