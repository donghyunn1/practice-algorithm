import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%5 == 0) {
            System.out.println(n/5);
        } else {
            System.out.println(n/5 + 1);
        }
    }
}