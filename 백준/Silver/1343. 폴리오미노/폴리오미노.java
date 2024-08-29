import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans = "";
        String A = "AAAA", B ="BB";

        s = s.replaceAll("XXXX",A);
        ans = s.replaceAll("XX",B);

        if (ans.contains("X")) {
            ans = "-1";
        }

        System.out.println(ans);
    }
}
