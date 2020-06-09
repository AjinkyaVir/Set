package com.company.TreeSet.treesetexample;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        /*
        * Data must be homogeneous
        * Must implements Comparable
        *
        * TreeSet does not allow Heterogeneous data
        * Null value does not allowed
        * */
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Aju");
        treeSet.add("Rahul");
        treeSet.add("Sau");
        treeSet.add("Pappu");
        System.out.println(treeSet);


        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(20);
        treeSet1.add(5);
        treeSet1.add(65);
        treeSet1.add(2);
        System.out.println(treeSet1);


    }

}
