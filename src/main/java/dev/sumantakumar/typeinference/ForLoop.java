package dev.sumantakumar.typeinference;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        for(var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        var names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        for(var name: names) {
            System.out.println(name);
        }
    }
}
