import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int value =n;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        while (true) {
            value = (value * n) % p;
            if (!set1.add(value)) {
                if (!set2.add(value)) {
                    break;
                }
            }
        }
        System.out.println(set2.size());
    }
}