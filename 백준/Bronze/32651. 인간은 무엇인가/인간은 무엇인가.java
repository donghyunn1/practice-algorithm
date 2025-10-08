import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2024 == 0 && n <= 100000) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}