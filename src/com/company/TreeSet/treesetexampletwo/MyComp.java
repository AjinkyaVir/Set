package com.company.TreeSet.treesetexampletwo;

import java.util.Comparator;

public class MyComp implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.p_name.compareTo(o2.p_name);
    }
}
