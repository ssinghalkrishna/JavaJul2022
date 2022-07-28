package javaTests;

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
}
