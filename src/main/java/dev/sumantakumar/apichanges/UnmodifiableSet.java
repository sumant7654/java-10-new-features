package dev.sumantakumar.apichanges;

import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

        Set<String> newSet = Set.copyOf(set);
        System.out.println(newSet);

        //newSet.add("E");
        //System.out.println(newSet);
    }
}
