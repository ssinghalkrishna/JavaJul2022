package javaTests;

public class TwoDimnArray {

    public static void main(String args[]) {
        String message = "May there be Peace in World!";
        int rows = 7;
        int cols = 4;
        //May
        //ther
        //e be
        // Pea
        //ce i
        //n Wo
        //rld!
        System.out.println(codeMessage(message, rows, cols));
    }

    private static String codeMessage(String message, int rows, int cols) {
        Character[][] arr = new Character[rows][cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = message.charAt(k);
                k++;
            }
        }
        String code = "";
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                code += arr[j][i];
            }
        }
        return code;
    }

}


