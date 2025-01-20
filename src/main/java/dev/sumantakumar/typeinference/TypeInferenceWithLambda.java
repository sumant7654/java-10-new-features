package dev.sumantakumar.typeinference;

import java.util.function.Predicate;

public class TypeInferenceWithLambda {
    public static void main(String[] args) {
        Predicate<Integer> predicate = num -> num % 2 == 0;
        System.out.println(predicate.test(10));

        Predicate<Integer> predicate2 = num -> {
            var mod = num % 2;
            return mod == 0;
        };

        System.out.println(predicate2.test(15));
    }
}
