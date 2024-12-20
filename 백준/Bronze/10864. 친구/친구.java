import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cnt = new int[n+1];

        while (m-->0) {
            st = new StringTokenizer(br.readLine());
            cnt[Integer.parseInt(st.nextToken())]++;
            cnt[Integer.parseInt(st.nextToken())]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++) {
            sb.append(cnt[i]).append("\n");
        }

        System.out.println(sb);
    }
}