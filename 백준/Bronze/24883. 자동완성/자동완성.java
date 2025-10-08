import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase().charAt(0) == 'n' ? "Naver D2" : "Naver Whale";
        System.out.println(s);
    }
}