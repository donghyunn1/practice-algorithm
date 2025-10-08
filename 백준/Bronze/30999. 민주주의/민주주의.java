import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int totalCount = 0;

        for (int i = 0; i < n; i++) {
            int oCount = 0;
            int xCount = 0;
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'O') {
                    oCount++;
                } else {
                    xCount++;
                }
            }
            if (oCount > xCount) {
                totalCount++;
            }
        }

        System.out.println(totalCount);
    }
}