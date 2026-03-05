import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int[] visitedArr;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        visitedArr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            visitedArr[i] = 0;
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
            Collections.sort(arr[i], Collections.reverseOrder()); // 내림차순
        }

        DFS(k);
        for (int i = 1; i <= n; i++) {
            System.out.println(visitedArr[i]);
        }

    }

    public static void DFS(int k) {
        visited[k] = true;
        visitedArr[k] = count++;
        
        for (int i : arr[k]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
