import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        int[] arr = new int[N+1];
        num = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            arr[i+1] = arr[i] + Integer.parseInt(num[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            num = br.readLine().split(" ");
            int start = Integer.parseInt(num[0]);
            int end = Integer.parseInt(num[1]);
            sb.append(arr[end] - arr[start - 1]).append("\n");
        }
        System.out.println(sb);
    }
}