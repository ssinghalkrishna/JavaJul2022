package junit;

public class Practice2 {

    private static String echoCommand = "echo %s > /sys/kernel/pixel_debug/trigger";

    private static int i = 0;

    public static void main(String args[]){
       // String abc = String.format(echoCommand, "hardlockup 1");
        //System.out.println(abc);
       /*if (a() || b()) {
            System.out.println("Hello! " + i++);
        }
        else {
            System.out.println(++i);
        }
        if (a() && b()) {
            System.out.println("Hello! " + i);
        }
        else {
            System.out.println(++i);
        }*/
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
        String s= "Hello";

        s= s+ " World!";
        System.out.println(s);
    }

    private static boolean a(){
        System.out.println("before plus plus in a " + i);
        i++;
        System.out.println("after plus plus in a " + i);
        return false;
    }
    private static boolean b(){
        System.out.println("before plus plus in b " + i);
        i++;
        System.out.println("after plus plus in b " + i);
        return true;
    }

}
