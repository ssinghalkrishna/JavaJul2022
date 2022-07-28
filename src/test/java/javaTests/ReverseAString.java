package javaTests;

public class Practice4 {

    public static void main(String[] args){
        String example = "aAbB" ; //reverse shall be llew;
        System.out.println(reverse(example));
    }

    private static String reverse(String example){
        if(example == null || example.length() == 0){
            return "empty or null string";
        }

        if(example.length() == 1){
            return example;
        }

        char[] cArr = example.toCharArray();
        char temp;

        for(int i = 0; i < cArr.length/2; i++){
            temp = cArr[i];
           cArr[i] = cArr[(cArr.length-1) - i];
            cArr[(cArr.length-1) - i] = temp;
        }
        return String.valueOf(cArr);
    }
}
