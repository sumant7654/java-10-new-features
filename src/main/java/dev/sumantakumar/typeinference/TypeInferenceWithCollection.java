package dev.sumantakumar.typeinference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceWithCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sumant");
        list.add("Shadab");
        list.add("Swastik");
        list.add("Swagat");
        list.add("Ankit");
        System.out.println(list);


        var names = new ArrayList<String>();
        names.add("Sumant");
        names.add("Shadab");
        names.add("Swastik");
        names.add("Swagat");
        names.add("Ankit");
        //names.add(new Integer(10));
        System.out.println(names);


        var objects = new ArrayList<>();
        objects.add("Sumant");
        objects.add("Shadab");
        objects.add(new Integer(10));
        objects.add(new Double(3.14));
        objects.add(20);
        objects.add(4.141);
        objects.add(new Thread());
        System.out.println(objects);


        var gen= new ArrayList();
        gen.add("Sumant");
        gen.add("Shadab");
        gen.add(new Thread());
        gen.add(10);
        System.out.println(gen);
    }
}
