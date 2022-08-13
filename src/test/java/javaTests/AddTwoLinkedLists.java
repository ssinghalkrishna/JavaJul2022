package javaTests;

import java.util.LinkedList;

public class AddTwoLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(8);
        list2.add(5);
       // list2.add(6);
       // list2.add(7);
        addTwoLists(list1, list2);
    }

    private static void addTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int size1 = list1.size();
        System.out.println("size1: " + size1);

        int size2 = list2.size();
        System.out.println("size2: " + size2);

        LinkedList<Integer> result = new LinkedList<>();
        int carryover = 0;

            int i = size2 - 1;
            int j = size1 - 1;
            while (j >= 0 && i >= 0) {
                int sum = list2.get(i) + list1.get(j);
                if (sum >= 10) {
                    sum =  sum % 10;
                    carryover = 1;
                    result.add(sum);
                    --i;
                    --j;
                    continue;
                }
                if (carryover == 1) {
                    result.add(sum + 1);
                    carryover = 0;
                } else {
                    result.add(sum);
                }
                --i;
                --j;
            }

            if (i >= 0){
                while (i >= 0) {
                    result.add(list2.get(i));
                    --i;
                }
            }
            else if (j >= 0){
                while (j >= 0) {
                    result.add(list1.get(j));
                    --j;
                }
            }
        System.out.println(result);
        }

    }