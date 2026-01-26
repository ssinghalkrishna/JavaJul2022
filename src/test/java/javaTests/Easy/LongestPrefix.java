package javaTests.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] words = {"apple", "app", "apply", "appium", "applied", "apps"};
        // longest(words);

        String[] words1 = {"apple", "apply", "appium", "applied", "apps"};
        longest1(words1);
    }

    private static void longest1(String[] words1) {
        //find shortest word
        int count, index = 0;
        int least = Integer.MAX_VALUE;

        for (int i = 0; i < words1.length; i++) {
            count = words1[i].length();
            if (count < least) {
                least = count; //4
                index = i;
            }
        }
        System.out.println("shortest word: " + words1[index] + " with length: " + least);
        String smallestWord = words1[index];

        boolean flag = false;
        for (int i = 0; i < words1.length; i++) {
            flag = false;
            System.out.println("least outside loop: " + least);
            for (int j = least; j >= 0; j--) {
                if (words1[i].substring(0, j).equals(smallestWord)) {
                    flag = true;
                    least = j; //3
                    System.out.println("least in loop: " + least);
                    break;
                }
                smallestWord = smallestWord.substring(0, smallestWord.length()-1);
            }
        }
        if (flag){
            System.out.println("longest prefix is: " + smallestWord);
        }
    }

    private static void longest(String[] words) {
        //find shortest word
        int count, index = 0;
        int least = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            count = words[i].length();
            if (count < least) {
                least = count;
                index = i;
            }
        }
        System.out.println("shortest word: " + words[index] + " with length: " + least);
        String smallestWord = words[index];

        boolean flag = true;
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].substring(0, least).equals(smallestWord))) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    private static void longestPrefix(String[] words){
        int shortestLength = Integer.MAX_VALUE;
        String shortestWord = "";
        for (String word: words){
            if (word.length() < shortestLength){
                shortestLength = word.length();
                shortestWord = word;
            }
        }
        ArrayList<String> newWords = new ArrayList<>();
        for (String word: words){
            if (!words.equals(shortestWord)){
                newWords.add(word);
            }
        }

        String shortestPrefix = "";

        for (int i = 0; i < shortestWord.length(); i++) {
            boolean flag = false;
            for (String word : newWords) {
                if (!(shortestWord.charAt(i) == word.charAt(i))) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                shortestPrefix += shortestWord.charAt(i);
            }
            else {
                break;
            }
        }
        System.out.println(shortestPrefix);
    }

    public static class AreAnagrams {
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
}
