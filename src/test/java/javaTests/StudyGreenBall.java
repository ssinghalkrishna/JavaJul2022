package javaTests;

import java.util.ArrayList;

public class StudyGreenBall {
    private static int index = 0;

    private static boolean isGreenBallPresent(ArrayList<Character> ball) {
        if (ball.get(0).equals('g')) {
            return true;
        }
        return false;
    }

    private static int findGreenBall(char[] balls) {
        ArrayList<Character> ball = new ArrayList<>();

        for (int i = 0; i < balls.length; i++) {
            ball.add(balls[i]);
            if (isGreenBallPresent(ball)) {
                return i;
            }
            ball.remove(0);
            System.out.println("ball shall be empty: " + ball.isEmpty());
        }
        return 9999;
    }

    private static boolean isGreenBallPresent1(char[] balls){
      for (int i = 0; i < balls.length; i++){
          if (balls[i] == 'g'){
              index = i;
              return true;
          }
      }
        index = 9999;
        return false;
    }

    public static void main(String[] args) {
        char[] balls = {'a', 'r', 'y', 'o', 'b', 'p'};
       // System.out.println(findGreenBall(balls));

        System.out.println("ball present or not: " + isGreenBallPresent1(balls));
        System.out.println("index of ball: " + index);
    }
}
