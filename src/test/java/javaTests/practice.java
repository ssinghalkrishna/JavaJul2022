package javaTests;

public class practice {
     String name = "soniya";

    public static void main(String[] args){
        String title = "mom";
//        System.out.println("my name is " + name);
//        System.out.println("my title is " + title);
        System.out.println(reverseAlphabets(";a@b#>c?!"));
    }

    private static void test() {
//        System.out.println("my name is " + name);
//        System.out.println("my title is " + title);
    }

    private static String reverseAlphabets(String test){
        String specialChars = "";
        String aphabetsReversed = "";
        String alphabets = "";
        //get string of alphabets
        for (int i = 0; i < test.length(); i++){
            if (test.charAt(i) >= 'a' & test.charAt(i) <= 'z'){
                alphabets += test.charAt(i);
            }
        }// "abc"
        char[] chArr = test.toCharArray();
        int j = alphabets.length() - 1;
        for (int i = 0; i < chArr.length; i++){
            if (chArr[i] >= 'a' & chArr[i] <= 'z'){
                char temp = chArr[i];
                chArr[i] = alphabets.charAt(j);
                --j;
            }
        }

        return String.valueOf(chArr);
    }
}
