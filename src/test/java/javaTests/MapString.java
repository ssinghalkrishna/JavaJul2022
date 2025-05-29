package javaTests;

import java.util.HashMap;
import java.util.Map;

public class MapString {
    public static void main(String[] args) {
        String a = "Welcome";
        String b = new String("Welcome");

        Map<String, String> map = new HashMap<>();
        map.put(a, "1");
        map.put(b, "2");
        System.out.println(map.entrySet());
        System.out.println("Map size: " + map.size());
    }
}
