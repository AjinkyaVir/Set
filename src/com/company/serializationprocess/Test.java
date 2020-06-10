package com.company.serializationprocess;

import java.io.*;

public class Test {

    void serializationDemo() throws IOException {
        Emp emp = new Emp(101,"Ajinkya");
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(emp);
        objectOutputStream.close();
        System.out.println("Serialization process closed....");
    }

    void deserialization() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Emp emp = (Emp) objectInputStream.readObject();
        System.out.println(emp.i + " " + emp.name);
        objectInputStream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test test = new Test();
        test.serializationDemo();
        test.deserialization();
    }

}
