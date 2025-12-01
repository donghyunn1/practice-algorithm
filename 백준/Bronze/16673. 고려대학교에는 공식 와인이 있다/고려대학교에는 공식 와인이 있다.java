import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= c; i++) {
            int t = i * k + i*i*p;
            sum += t;
        }

        System.out.println(sum);
    }
}