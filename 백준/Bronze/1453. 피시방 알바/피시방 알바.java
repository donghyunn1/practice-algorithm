import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int[] array = new int[101];
        for (int i = 1; i <= num; i++) {
            int pos = sc.nextInt();
            if (array[pos] == 0) {
                array[pos] = 1;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
