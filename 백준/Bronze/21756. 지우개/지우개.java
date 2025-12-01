import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
        }

        while (arrayList.size() >= 2) {
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.remove(i);
            }
        }

        System.out.println(arrayList.get(0));
    }
}