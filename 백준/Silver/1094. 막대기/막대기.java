import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        int[] arr = {64, 32, 16, 8, 4, 2, 1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                sum += arr[i];
                count++;
            }
            if (sum > x) {
                sum -= arr[i];
                count--;
            }
            if (sum == x) break;
        }

        System.out.println(count);
    }
}
