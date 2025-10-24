import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] arr = new String[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr[0].length(); i++) {
            boolean flag = true;
            char c = arr[0].charAt(i);
            for (int j = 1; j < t; j++) {
                if (arr[j].charAt(i) != c) {
                    flag = false;
                } 
            }
            if (flag) {
                System.out.print(c);
            } else {
                System.out.print("?");
            }
        }
    }
}