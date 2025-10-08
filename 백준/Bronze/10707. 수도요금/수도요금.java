import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr[0];
        int m = arr[1];
        int k = arr[2];
        int l = arr[3];
        int p = arr[4];

        int yPay = 0;
        if (p > k) {
            yPay = m + (p - k) * l;
        } else {
            yPay = m;
        }

        if (n * p > yPay) {
            System.out.println(yPay);
        } else {
            System.out.println(n * p);
        }
    }
}