package com.company.TreeSet.treesetexampleone;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2); // To print data in descending order
    }
}
