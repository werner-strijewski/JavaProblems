package org.strijewski.problems.dehash;

//acdegiklmnoprstuw
//682697436409
//leepadg
//24626831736490

public class Dehash {
    static String letters = "acdegiklmnoprstuw";

    static String dehash (long hash) {
        String result = "";
        while (hash > 37) {
            long index = hash % 37;
            int intIndex = Integer.valueOf(Long.toString(index));
            result = letters.charAt(intIndex) + result;
            hash = (hash - index) / 37;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The dehash for 682697436409 is " + dehash(682697436409L));
        System.out.println("The dehash for 24626831736490 is " + dehash(24626831736490L));
    }
}