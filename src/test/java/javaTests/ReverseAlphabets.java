package javaTests;

public class ReverseAlphabets {
    public static void main(String[] args) {
        //    revereseAlphabets("m,l,.kj-=/gyt@4%6$");
//        revereseAlphabets(null);
//        String abc = null;
//        String def = "";
//        revereseAlphabets(abc);
//        revereseAlphabets(def);
    }

    private static void revereseAlphabets(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        String alphabets = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' & word.charAt(i) <= 'z') {
                alphabets += word.charAt(i);
            }
        }
        System.out.println(alphabets);
        String reverse = "";
        for (int i = alphabets.length() - 1; i >= 0; i--) {
            reverse += alphabets.charAt(i);
        }
        System.out.println(reverse);
    }

}
