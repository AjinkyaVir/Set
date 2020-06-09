package com.company.TreeSet.treesetexamplethree;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        /* Tree set methods */
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=1; i<=10; i++){
            treeSet.add(i);
        }
        System.out.println(treeSet);

        // To write sub set of tree set use subSet()method
        SortedSet<Integer> sortedSet = treeSet.subSet(3,8);
        TreeSet<Integer> treeSet1 = new TreeSet<>(sortedSet);
        System.out.println(treeSet1);

        //  use of tailSet()method
        SortedSet<Integer> sortedSet1 = treeSet.tailSet(5);
        TreeSet<Integer> treeSet2 = new TreeSet<>(sortedSet1);
        System.out.println(treeSet2);

        //  use of headSet()method
        SortedSet<Integer> sortedSet2 = treeSet.tailSet(8);
        TreeSet<Integer> treeSet3 = new TreeSet<>(sortedSet2);
        System.out.println(treeSet3);

    }

}
