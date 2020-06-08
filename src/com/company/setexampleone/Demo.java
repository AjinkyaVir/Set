package com.company.setexampleone;

import java.util.HashSet;

public class Demo {

    public static void main(String[] args) {

        /*
        * In HashSet duplicate values are not allowed.
        * */

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Aju");
        hashSet.add("Anu");
        hashSet.add("Abhi");
        hashSet.add("Andy");
        hashSet.add("Aju");
        System.out.println(hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        System.out.println(hashSet1.add("Raju"));
        System.out.println(hashSet1.add("Raju"));
        System.out.println(hashSet1);

    }

}
