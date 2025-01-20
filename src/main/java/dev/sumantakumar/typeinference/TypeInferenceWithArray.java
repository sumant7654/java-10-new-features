package dev.sumantakumar.typeinference;

public class TypeInferenceWithArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        for(var each : intArray) {
            System.out.println(each);
        }

        var intArray2 = new int[]{6, 7, 8, 9, 10};
        for(var each : intArray2) {
            System.out.println(each);
        }


        int[] newIntArray = new int[2];
        newIntArray[0] = 11;
        newIntArray[1] = 12;
        for(var each : newIntArray) {
            System.out.println(each);
        }

        var varArray = new int[2];
        varArray[0] = 13;
        varArray[1] = 14;
        for(var each : varArray) {
            System.out.println(each);
        }


    }
}
