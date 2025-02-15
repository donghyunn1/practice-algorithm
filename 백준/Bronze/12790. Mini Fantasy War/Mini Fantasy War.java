import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[8];
        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 8개의 값을 모두 입력받음
            for (int j = 0; j < 8; j++) {
                array[j] = Integer.parseInt(st.nextToken());  // i 대신 j 사용
            }

            // 모든 값을 입력받은 후 계산
            int hp = array[0] + array[4];
            if (hp < 1) hp = 1;

            int mp = array[1] + array[5];
            if (mp < 1) mp = 1;

            int attack = array[2] + array[6];
            if (attack < 0) attack = 0;

            int defense = array[3] + array[7];

            System.out.println(hp + mp * 5 + attack * 2 + defense * 2);
        }
    }
}