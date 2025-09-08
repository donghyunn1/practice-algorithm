import java.util.Scanner;

public class Main {
    static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String[] str = example.split("-");
        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    static int mySum(String str) {
        int sum = 0;
        String temp[] = str.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
