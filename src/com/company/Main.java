package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      ArrayList<Integer> list1=new ArrayList();
        list1.add(5);
        list1.add(23);
        list1.add(566);
        list1.add(587);
        list1.add(253);
        list1.add(26);

        ArrayList<Integer> list2=new ArrayList();
        list2.add(36);
        list2.add(356);
        list2.add(689097987);
        list2.add(3767);
        list2.add(635835);
        list2.add(35687);


	SortingAdd addsort=new SortingAdd();
	//addsort.setValue(list1);


	    addsort.setStrategy(new DefaultSortingAdd());
	    addsort.execute(list1,list2);
	    System.out.println(addsort);

        addsort.setStrategy(new DirectSortingAdd());
        addsort.execute(list1,list2);
        System.out.println(addsort);

        addsort.setStrategy(new ReverseSortingAdd());
        addsort.execute(list1,list2);
        System.out.println(addsort);

        System.out.println(list1);



    }
}
