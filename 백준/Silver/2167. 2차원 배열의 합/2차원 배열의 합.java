import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int K = sc.nextInt();
        while (K-- > 0) {
            int sum = 0;
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int a = x1-1; a < x2; a++) {
                for (int b = y1-1; b < y2; b++) {
                    sum += arr[a][b];
                }
            }
            System.out.println(sum);
        }
    }
}
