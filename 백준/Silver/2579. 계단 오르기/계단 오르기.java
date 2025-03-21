import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 계단의 개수를 입력받습니다.
        int n = scanner.nextInt();
        
        // 계단의 숫자를 초기화 합니다. 1층은 1번째(not 0번째) 인덱스에 저장합니다.
        int[] stairs = new int[301];
        for (int i = 1; i <= n; i++) {
            stairs[i] = scanner.nextInt();
        }
        
        // dp 배열을 초기화합니다.
        int[] dp = new int[301];
        dp[1] = stairs[1];
        
        if (n >= 2) {
            dp[2] = stairs[1] + stairs[2];
        }
        
        if (n >= 3) {
            dp[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);
        }
        
        // 점화식을 계산합니다.
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.max(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i]);
        }
        
        System.out.println(dp[n]);
        
        scanner.close();
    }
}