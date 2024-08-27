import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄: 대기 명단의 수와 민규의 친구 수
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 두 번째 줄: 대기 명단
        List<String> citizenList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            citizenList.add(sc.next());
        }
        
        // 세 번째 줄: 민규의 친구 대기 번호
        Set<String> friendsSet = new HashSet<>();
        for (int i = 0; i < M; i++) {
            friendsSet.add(sc.next());
        }
        
        // 교환 횟수 계산
        int result = 0;
        for (int i = 0; i < M; i++) {
            if (!friendsSet.contains(citizenList.get(i))) {
                result++;
            }
        }
        
        // 결과 출력
        System.out.println(result);
    }
}
