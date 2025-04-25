import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[20];
        int bobSum = 0;

        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            bobSum += arr[i];
        }

        int index = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i] == 20) {
                index = i;
                break;
            }
        }

        int aliceSum = 0;
        if (index == 0) {
            aliceSum = arr[0] + arr[1] + arr[19]; 
        } else if (index == 19) {
            aliceSum = arr[19] + arr[18] + arr[0]; 
        } else {
            aliceSum = arr[index] + arr[index - 1] + arr[index + 1];
        }

        double aliceAvg = aliceSum / 3.0;
        double bobAvg = bobSum / 20.0; 

        if (aliceAvg > bobAvg) {
            System.out.println("Alice");
        } else if (aliceAvg < bobAvg) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }
    }
}