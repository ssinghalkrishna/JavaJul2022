package javaTests;

import java.util.Arrays;

public class ReverseAString {

    public static void main(String[] args) {
        String example = "aAbB"; //reverse shall be llew;
        System.out.println(reverse(example));
    }

    private static String reverse(String example) {
        if (example == null || example.length() == 0) {
            return "empty or null string";
        }

        if (example.length() == 1) {
            return example;
        }

        char[] cArr = example.toCharArray();
        char temp;
        for (int i = 0; i < cArr.length / 2; i++) {
            temp = cArr[i];
            cArr[i] = cArr[cArr.length - 1 - i];
            cArr[cArr.length - 1 - i] = temp;
        }
        System.out.println("1" + cArr);
        System.out.println("2" + Arrays.toString(cArr));
        System.out.println("3" + String.valueOf(cArr));
        return String.valueOf(cArr);
    }
}
