import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 2];
        int[] t = new int[n + 2];
        int[] p = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        for (int i = n; i > 0; i--) {
            if (i + t[i] > n + 1) {
                d[i] = d[i + 1];
            } else {
                d[i] = Math.max(d[i + 1], p[i] + d[i + t[i]]);
            }
        }
        System.out.println(d[1]);
    }
}