import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        List<String> arr = new ArrayList<>();
        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                arr.add(getWord(s, i, j));
            }
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
    }

    private static String getWord(String s, int i, int j) {
        StringBuilder s1 = new StringBuilder(s.substring(0,i));
        StringBuilder s2 = new StringBuilder(s.substring(i,j));
        StringBuilder s3 = new StringBuilder(s.substring(j));
        StringBuilder sb = new StringBuilder();
        sb.append(s1.reverse()).append(s2.reverse()).append(s3.reverse());
        return sb.toString();
    }
}