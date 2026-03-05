import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] countArr;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        countArr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            countArr[i] = 0; // 결과를 담을 배열
        }

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        DFS(k);

        for (int i = 1; i <= n; i++) {
            System.out.println(countArr[i]);
        }
    }

    public static void DFS(int k) {
        visited[k] = true;
        countArr[k] = count++;

        for (int i : arr[k]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}