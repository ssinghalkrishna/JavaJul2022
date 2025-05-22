package javaTests;

import java.util.HashMap;
import java.util.Map;

public class AreAnagrams {
    public static void main(String[] args) {
        //  System.out.println("Hello world!");
        // Write a method to decide if two strings are anagrams or not. i.e. “mile” “lime”
        String word1 = "mily";
        String word2 = "lime";
        System.out.println(isAnagram(word1, word2));
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1 == null || word2 == null || word1.isEmpty() || word2.isEmpty()) {
            return false;
        }
        if (word1.length() != word2.length()) {
            return false;
        }
        if (word1.length() == 1 && word2.length() == 1) {
            return true;
        }
//        if (word1.length() == word2.length()) {
//            for (int i = 0; i < word1.length(); i++) {
//                boolean flag = false;
//                for (int j = 0; j < word2.length(); j++) {
//                    if (word1.charAt(i) != word2.charAt(j)) {
//                        continue;
//                    } else {
//                        flag = true;
//                        break;
//                    }
//                }
//                if(!flag){
//                    return false;
//                }
//            }
//        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (!map.containsKey(word1.charAt(i))) {
                map.put(word1.charAt(i), 1);
            } else {
                int j = map.get(word1.charAt(i));
                map.put(word1.charAt(i), ++j);
            }
        }
        System.out.println(map.entrySet());
        for (int j = 0; j < word2.length(); j++) {
            for (char c : map.keySet()) {
                if (word2.charAt(j) == c) {
                    int count = map.get(c) - 1;
                    map.put(c, count);
                    break;
                }
            }
        }
        for (char c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}

