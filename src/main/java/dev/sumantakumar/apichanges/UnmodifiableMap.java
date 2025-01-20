package dev.sumantakumar.apichanges;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Barclays");
        map.put("C", "Cognizant");
        map.put("D", "Deloitte");

        System.out.println(map);


        Map<String, String> newMap = Map.copyOf(map);
        System.out.println(newMap);

        //newMap.put("E", "EY");
        //System.out.println(newMap);
    }
}
