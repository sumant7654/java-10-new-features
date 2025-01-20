package dev.sumantakumar.apichanges;

import java.util.ArrayList;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        List<String> newList = List.copyOf(list);
        System.out.println(newList);

        //newList.add("E");
        //System.out.println(newList);
    }
}
