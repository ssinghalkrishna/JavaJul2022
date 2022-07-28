package javaTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PushZeroesToEnd {
    private static int[] pushZeroesToEnd(int[] arr){
        System.out.println("original " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[j] != 0){
                        arr[i] = arr[j];
                        arr[j] = 0;
                        System.out.println(Arrays.toString(arr));
                        break;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
      //  System.out.println("final " + Arrays.toString(pushZeroesToEnd(new int[] {1, 0, 0, 2, 0, 3, 0, 4})));
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    System.out.println(list1);
    System.out.println(list1.get(0));
    }
}
