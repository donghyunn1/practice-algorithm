import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        if (n * 100  >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}