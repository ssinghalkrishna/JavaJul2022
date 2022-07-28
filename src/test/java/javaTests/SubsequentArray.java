package JavaTests;

public class SubsequentArray {

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, -6, 7, -6, 9, -7, 6};
        int[] arr2 = {1, -6, 7, -6, 8};
        System.out.println(isSubsequent(arr2, arr1));
    }
    private static boolean isSubsequent(int[] arr2, int[] arr1) {
        int first = 0;
        int second = 0;
        int start = 0;
        for (int i = 0; i < arr2.length; i++) {
            boolean isPresent = false;
            if (first == 0){
                start = 0;
            }
            else {
                start = first +1;
            }
            for (int j = start; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    if (i == 0){
                        first = j;
                    }
                    else if (i == 1){
                        second = j;
                    }
                    else {
                        first = second;
                        second = j;
                    }
                    if (second < first && second != 0){
                        return false;
                    }
                    isPresent = true;
                    break;
                }
            }
            if (isPresent == false){
                return false;
            }
        }
        return true;
    }
}
