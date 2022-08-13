package javaTests;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> llist = new LinkedList<Integer>();
        Map<Character, String> map = new HashMap<Character, String>();
        Set<Character> set = new HashSet<Character>();
        Set<Character> lset = new LinkedHashSet<Character>();

        String word = "engineering";
        String example = "abcirghjkl";
        uniqueLettersInWord(word, example);
       // System.out.println(findInSortedArray(new int[]{3, 5, 8, 9, 10, 45}, 3));
    }

    private static boolean findInSortedArray(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;//5
        int mid;
        while (low <= high) {
            mid = (low + high) / 2; //low + ((high - low)/2);//2, 4
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;//3
            }
        }
        return false;
    }

    private static void uniqueLettersInWord(String word, String example) {
        Set<Character> setWord = new HashSet<Character>();
        for (int i = 0; i < word.length(); i++) {
            setWord.add(word.charAt(i));
        }
        System.out.println(setWord);

        Set<Character> setExample = new HashSet<Character>();
        for (int i = 0; i < example.length(); i++) {
            setExample.add(example.charAt(i));
        }
        System.out.println(setExample);

        Set<Character> setResult = new HashSet<Character>();
//        for (int i = 0; i < example.length(); i++) {
//            if (setWord.contains(example.charAt(i))) {
//                setResult.add(example.charAt(i));
//            }
//        }
//        System.out.println(setResult);
        Character[] ch = new Character[setExample.size()];

        Character[] ch1 = setExample.toArray(ch);

        for(int i = 0; i < ch1.length; i++){
            if (setWord.contains(ch1[i])){
               setResult.add(ch1[i]);
            }
        }
        System.out.println(setResult);
    }
}
