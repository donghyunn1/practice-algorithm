import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

            int[] arr = new int[s1.length()];

            for (int j = 0; j < s1.length(); j++) {
                if (s2.charAt(j) >= s1.charAt(j)) {
                    arr[j] = s2.charAt(j) - s1.charAt(j);
                }
                else {
                    arr[j] =  s2.charAt(j) - s1.charAt(j) + 26;
                }
            }
            System.out.print("Distances: ");
            for (int j = 0; j<arr.length; j++) {
                System.out.print(arr[j]+ " ");
            }
            System.out.println();
        }
    }
}