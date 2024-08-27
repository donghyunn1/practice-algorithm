import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int H,I,A,R,C;

        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        I = sc.nextInt();
        A = sc.nextInt();
        R = sc.nextInt();
        C = sc.nextInt();

        System.out.println(H*I-A*R*C);
    }
}