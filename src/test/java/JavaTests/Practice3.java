package JavaTests;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * print longest continuous string from a string until a char repeats
 */
public class Practice3 {
    public static void main(String[] args) {
        String test = "abckrbbda";
        System.out.println(longestStr(test));
    }

    private static String longestStr(String test) {
        char[] arr = test.toCharArray();
        String result = "";
        Set<Character> set = new LinkedHashSet<Character>();

        for (int i = 0; i < test.length(); i++) {
            if (!set.contains(test.charAt(i))) {
                set.add(arr[i]);
            } else break;
        }

        for (char c : set) {
            result += c;
        }
        return result;
    }
}