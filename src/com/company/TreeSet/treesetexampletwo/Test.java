package com.company.TreeSet.treesetexampletwo;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        TreeSet<Product> treeSet = new TreeSet<Product>(new MyComp());
        treeSet.add(new Product(111,"Chair",1000.52));
        treeSet.add(new Product(222,"Table",2300.45));
        treeSet.add(new Product(642,"Fan",700.65));
        treeSet.add(new Product(220,"Stool",425.31));

        for (Product p : treeSet
             ) {
            System.out.println(p.p_id + " " + p.p_name + " " + p.p_cost);
        }
    }
}
