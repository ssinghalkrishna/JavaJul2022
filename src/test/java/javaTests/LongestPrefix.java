package javaTests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestPrefix {

    public static void main(String[] args) {
        String[] words = {"apple", "apply", "appl", "appium", "applied"};

        System.out.println(longest(words));
    }

    private static String longest(String[] words) {
        int shortestWordSize = Integer.MAX_VALUE;
        String shortestWord = "";

        for (String word : words) {
            if (word.length() < shortestWordSize) {
                shortestWordSize = word.length();//5,
                shortestWord = word;
            }
        }
        System.out.println("shortestWordSize: " + shortestWordSize);
        System.out.println("shortestWord: " + shortestWord);

        ArrayList<String> arrlist = new ArrayList<String>();
        for (String word : words) {
            if (!(word.equals(shortestWord))) {
                arrlist.add(word);
            }
        }
        System.out.println(arrlist);

        char[] arr = shortestWord.toCharArray(); //{'a', 'p', 'p', 's'}
        int distance = arr.length;
        String prefix = "";

        Set<String> prefixes = new HashSet<String>();

        for (String word : arrlist) {
            prefix = "";
            for (int j = 0; j < distance; j++) {
                if (word.charAt(j) == arr[j]) {
                    prefix += arr[j]; //"app",
                }
            }
            System.out.println("prefix: " + prefix);
            prefixes.add(prefix);
        }
        System.out.println(prefixes);

        int shortestPrefix = Integer.MAX_VALUE;
        String shortestPrefixV = "";
        for (String prefixS: prefixes){
            if (prefixS.length() < shortestPrefix){
                shortestPrefix = prefixS.length();
                shortestPrefixV = prefixS;
            }
        }
        return shortestPrefixV;
    }
}
