package javaTests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueDigitsInNumber {
    // Print all numbers from 100 to 999 inclusive, which do not have duplicate digits.
    //102, 103 are fine
    // not 100, 101, 111, 122
    public static void main(String[] args) {
        printNonDuplicateNums(100, 120);
    }

    private static void printNonDuplicateNums(int low, int high) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = low; i <= high; i++) {
            if (isNotDupDigits(i)) {
                list.add(i);
            }
        }
        System.out.println();
        System.out.println(list);
    }

    private static boolean isNotDupDigits(int num) {
        System.out.print(num + " ");
        Set<Integer> set = new HashSet<Integer>();

        while (num > 0) { //101, 10, 1
            int digit = num % 10; //1, 0
            if (set.contains(digit)) {
                return false;
            } else {
                set.add(digit);
            }
            num = num / 10;//10, 1
        }
        return true;
    }

}
