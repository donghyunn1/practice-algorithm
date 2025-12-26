import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, L, ent=0, max=0;

    public static void main(String args[]) throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            String str = br.readLine();
            String[] parts = str.split("0");

            int cnt = 0;
            for(String part : parts){
                if(!part.isEmpty()){
                    cnt++;
                }
            }

            if(max < cnt){
                max = cnt;
                ent = 1;
            } else if(max == cnt){
                ent++;
            }
        }
        System.out.print(max + " " + ent);
    }
}