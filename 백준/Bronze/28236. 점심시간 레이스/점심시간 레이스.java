import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int min=100000000;
        int index=0;

        for(int i=1; i<=k; i++){
            st=new StringTokenizer(br.readLine());
            int tempn=Integer.parseInt(st.nextToken()); //층
            int tempm=Integer.parseInt(st.nextToken()); //반
            int temp=tempn-1+m-tempm;
            index= min>temp ? i : index;
            min= Math.min(min, temp);
        }
        System.out.println(index);
    }
}