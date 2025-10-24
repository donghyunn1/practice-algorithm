import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

        if (m + T > M) {
            System.out.println("-1");
            return;
        }

        int i = 0;
        int time = 0;
        int pulse = m;

        while (i < N) {
            if (pulse + T <= M) {
                pulse += T;
                i++;
            } else {
                pulse = Math.max(pulse - R, m);
            }
            time++;
        }
        System.out.println(time);
    }
}