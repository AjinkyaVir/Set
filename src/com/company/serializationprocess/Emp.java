package com.company.serializationprocess;

import java.io.Serializable;

public class Emp implements Serializable {

    int i;
    String name;

    public Emp(int i, String name) {
        this.i = i;
        this.name = name;
    }
}
