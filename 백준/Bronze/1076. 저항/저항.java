import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        map.put("black","0");
        map.put("brown", "1");
        map.put("red", "2");
        map.put("orange", "3");
        map.put("yellow", "4");
        map.put("green", "5");
        map.put("blue", "6");
        map.put("violet", "7");
        map.put("grey", "8");
        map.put("white", "9");

        String s = sc.next();
        String b = sc.next();
        String c = sc.next();

        long sum = Long.parseLong(map.get(s) + map.get(b));
        sum *= Math.pow(10, Integer.parseInt(map.get(c)));
        System.out.println(sum);
    }
}