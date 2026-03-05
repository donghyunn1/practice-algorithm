import java.util.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            arr[s].add(e);
            arr[e].add(s);
        }

        DFS(1);

        System.out.println(count);
    }

    public static void DFS(int s) {
        visited[s] = true;
        for (int i : arr[s]) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }

    }
}