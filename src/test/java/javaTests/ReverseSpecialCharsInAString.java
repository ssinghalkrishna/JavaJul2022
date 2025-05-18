package javaTests;

public class ReverseSpecialCharsInAString {
    public static void main(String[] args) {
        //reverse order of only special chars in a given string
        String test = "ab%#cd$efg@";
        System.out.println("with special chars reversed " + reverseSpecial(test));
    }

    private static String reverseSpecial(String test) {
        System.out.println("original " + test);
        if (test == null || test.length() == 0) {
            return "empty or null string";
        }
        if (test.length() == 1) {
            return test;
        }
        String specialChars = "";
        for (int i = 0; i < test.length(); i++) {
            if (!(test.charAt(i) >= 'a' && test.charAt(i) <= 'z')) {
                specialChars += test.charAt(i);
            }
        }
        System.out.println("specialChars: " + specialChars);
        if (specialChars.length() == 0) { // "ac%de"
            return "No special chars found";
        }
        if (specialChars.length() == 1) { // "ac%de"
            return specialChars;
        }
// ac#de#gh&ty& -> #& - getting complicated

        int j = specialChars.length() - 1;
        char[] chArrOriginal = test.toCharArray();

        for (int i = 0; i < chArrOriginal.length; i++) {
            if (!(chArrOriginal[i] >= 'a' && chArrOriginal[i] <= 'z')) {
                chArrOriginal[i] = specialChars.charAt(j);
                --j;
            }
        }
        return String.valueOf(chArrOriginal);
    }
}