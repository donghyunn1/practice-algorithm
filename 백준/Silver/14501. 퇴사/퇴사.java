import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 2];
        int[] t = new int[n + 1];
        int[] p = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        
        for (int i = n; i >= 1; i--) {
            if (i + t[i] > n + 1) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + 1], dp[i + t[i]] + p[i]);
            }
        }

        System.out.println(dp[1]);
    } 
}