import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int find = s.indexOf("pPAp", i);
            if (find == -1) {
                break;
            }
            cnt++;
            i = find + 3;
        }
        System.out.println(cnt);
    }
}