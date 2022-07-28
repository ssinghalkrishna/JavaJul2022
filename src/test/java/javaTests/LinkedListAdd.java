package javaTests;

import java.util.LinkedList;
import java.util.List;

public class Practice6 {
    //insert element at head and tail of linked list

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(0, 0);
        list.add(list.size(), 6);
        list.add(2, -6);
        System.out.println(list);
    }
}
