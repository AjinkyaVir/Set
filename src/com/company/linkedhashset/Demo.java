package com.company.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {

    public static void main(String[] args) {

        LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Employee(101,"Ajinkya"));
        linkedHashSet.add(new Employee(221,"Sayali"));
        linkedHashSet.add(new Employee(551,"Abhinay"));
        linkedHashSet.add(new Employee(660,"Sharaddha"));

        for (Employee employee : linkedHashSet) {
            System.out.println(employee.emp_id + " " + employee.emp_name);

        }

    }

}
