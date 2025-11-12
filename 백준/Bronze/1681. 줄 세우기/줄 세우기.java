import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String m = st.nextToken();

        int count = 0;
        while (n > 0) {
            count++;
            if (!String.valueOf(count).contains(m)) {
                n--;
            }
        }

        System.out.println(count);
    }
}