package com.company.TreeSet.treesetexampleone;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new MyComp()); // Comparator constructor
        treeSet.add("Aju");
        treeSet.add("Suu");
        treeSet.add("Shubhu");
        treeSet.add("Dubu");

        for (String s: treeSet
             ) {
            System.out.println(s); //To print TreeSet data
        }


    }

}
