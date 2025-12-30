import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static char[] A;
    private static char[] B;
    private static long[][] dp;
    private static ArrayList<Character> Path;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = br.readLine().toCharArray();
        B = br.readLine().toCharArray();
        dp = new long[A.length + 1][B.length + 1];
        Path = new ArrayList<>();

        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // 같은 문자열일 때 왼쪽 대각선 값
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // 다르면 왼쪽 or 위 중 큰 값
                }
            }
        }

        System.out.println(dp[A.length][B.length]);
        getText(A.length, B.length);
        for (int i = Path.size() - 1; i >= 0; i--) {
            System.out.print(Path.get(i));
        }
    }

    private static void getText(int row, int col) {
        if (row == 0 || col == 0) {
            return;
        }

        if (A[row - 1] == B[col - 1]) { // 같으면 LCS에 기록하고 왼쪽
            Path.add(A[row - 1]);
            getText(row - 1, col - 1);
        } else {
            if (dp[row - 1][col] > dp[row][col - 1]) {
                getText(row - 1, col);
            } else {
                getText(row, col - 1);
            }
        }
    }
}