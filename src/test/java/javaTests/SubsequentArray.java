package javaTests;

public class SubsequentArray {

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, -6, 7, -6, 9, -7, 6};
        int[] arr2 = {1, -6, 7, -6, 9};
        System.out.println(isSubsequent(arr2, arr1));
    }

    private static boolean isSubsequent(int[] arr2, int[] arr1){
        int start = -1;
        for (int i = 0; i < arr2.length; i++){
            boolean flag = false;
            for (int j = start + 1 ; j < arr1.length; j++){
                if (arr2[i] == arr1[j]){
                    flag = true;
                    start = j;
                    break;
                }
            }
            if (!flag){
                return flag;
            }
        }
        return true;
    }

}
