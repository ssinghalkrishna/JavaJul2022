package javaTests;

public class FindMinMaxIn2DimArray {
    //find number which is max in row and min in its column, in a 2 dim array

    public static void main(String[] args) {
        int[][] matrix = {{3, 5, 6, 8}, {2, 4, 27, 9}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int col = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    col = j;
                }
            }// end of row
            for (int l = 0; l < rows; l++) {
                if (matrix[l][col] < min) {
                    min = matrix[l][col];
                }
            }
            if (max == min) {
                System.out.println("Max, Min in row " + i + " is: " + max);
            } else {
                System.out.println("No max, min in row: " + i);
            }
        }
    }
}
