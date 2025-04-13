import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        double sum = 0;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int num1 = sc.nextInt();
            arr[i] = num1;
            if (max < num1) {
                max = num1;
            }
        }
        for (int i = 0; i < num; i++) {
             sum += (double) arr[i] / max * 100.0;
        }
        System.out.println(sum/num);
    }
}