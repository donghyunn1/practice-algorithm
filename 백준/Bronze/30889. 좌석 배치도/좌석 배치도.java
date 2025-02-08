import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] seats = new char[10][20];  // A~J열, 1~20번
        
        // 모든 좌석을 '.'으로 초기화
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 20; j++) {
                seats[i][j] = '.';
            }
        }
        
        // 예매 정보 입력 받기
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String reservation = br.readLine();
            // 열 정보 (A는 0번 인덱스로 변환)
            int row = reservation.charAt(0) - 'A';
            // 좌석 번호 (1번은 0번 인덱스로 변환)
            int col = Integer.parseInt(reservation.substring(1)) - 1;
            seats[row][col] = 'o';
        }
        
        // 좌석 배치도 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 20; j++) {
                sb.append(seats[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}