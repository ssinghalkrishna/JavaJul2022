package javaTests;

public class Practice {
    public static void main(String[] args){
        String sentence = "Java coding is fun and challenging";
        //swap first and last char of each word in sentence
       // swap(sentence);
        swap1(sentence);
    }

    private static void swap1(String sent) {
        System.out.println(sent);

        String[] words = sent.split(" ");
        String reverse = "";

        for (int i = 0; i < words.length; i++) {
            char temp;
            String word = words[i];
            char[] chArr = word.toCharArray();

            temp = chArr[0];
            chArr[0] = chArr[chArr.length -1];
            chArr[chArr.length -1] = temp;
            word = String.valueOf(chArr);
            words[i] = word;
            reverse += words[i] + " ";
        }
        System.out.println(reverse);
    }

    private static void swap(String sentence){
        String[] words = sentence.split(" ");
        int len;
        char first, last;
        char[] ch;

        for(String word: words){
            ch = word.toCharArray();

            len = ch.length;
            first = ch[0];
            last = ch[len-1];

           ch[len-1] = first;
            ch[0] = last;

           System.out.print(String.valueOf(ch)+ " ");
        }
    }
}
