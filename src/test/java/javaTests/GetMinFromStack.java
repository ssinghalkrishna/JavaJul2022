package javaTests;

import java.util.Stack;

public class GetMinFromStack {
   static Stack<Integer> stack = new Stack<>();
   static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        System.out.println(getMinFromStack(stack));
    }

    private static Integer getMinFromStack(Stack<Integer> stack) {
        int num = 5;
        pushNum(num);
       // popNum();
        pushNum(6);
        pushNum(1);
        return min;
    }

    private static void pushNum(int num){
        if (stack.isEmpty()) {
            min = num;
            stack.push(num);
        }
        else {
            int top = stack.peek();
            if (top < num){
                min = top;
            }
            else if (top >= num){
                min = num;
            }
        }
    }

}
