package javaTests;

public class Practice5 {

    private static String echoCommand = "echo %s > /sys/kernel/pixel_debug/trigger";

    private static int i = 0;

    public static void main(String args[]){
       // String abc = String.format(echoCommand, "hardlockup 1");
        //System.out.println(abc);
       if (a() || b()) {
            System.out.println("Hello! " + i++); //2
        }
        else {
            System.out.println(++i);
        }
        if (a() && b()) {
            System.out.println("Hello! " + i);
        }
        else {
            System.out.println(++i); //5
        }
        /*if (b() && a()) {
            System.out.println("Hello! " + i);
        }
        else {
            System.out.println(++i);
        }*/
        /*int j = 0;
        int x = 5 + j++;
        System.out.println("x: " + x); //5 , j=1
        int y = 5 + j++;
        System.out.println("y: " + y); //6, j=2
        int z = 5 + ++j;
        System.out.println("z: " + z); //8, j=3*/

        //        String s= "Hello";
//
//        s= s+ " World!";
//        System.out.println(s);
    }

    private static boolean a(){
        System.out.println("before plus plus in a " + i); //0, 3
        i++;
        System.out.println("after plus plus in a " + i); //1, 4
        return false;
    }
    private static boolean b(){
        System.out.println("before plus plus in b " + i); //1
        i++;
        System.out.println("after plus plus in b " + i); //2
        return true;
    }

}
