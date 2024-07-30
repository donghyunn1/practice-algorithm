import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[6];

        for(int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < 6; i++) {
            if(arr[i] % t == 0)  cnt += arr[i] / t;
            else cnt += (arr[i] / t) + 1;
        }
        System.out.println(cnt);
        System.out.print(n / p +" "+ n % p);
    }
}
