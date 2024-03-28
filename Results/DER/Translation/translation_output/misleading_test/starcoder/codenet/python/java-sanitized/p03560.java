import java.util.PriorityQueue;
import java.util.Scanner;

public class p03560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] edges = new int[n][2];
        for (int i = 0; i < n; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (visited[cur[1]]) continue;
            visited[cur[1]] = true;
            for (int[] edge : edges) {
                if (edge[0] == cur[1]) {
                    if (dist[edge[1]] > dist[cur[1]] + edge[1]) {
                        dist[edge[1]] = dist[cur[1]] + edge[1];
                        pq.add(new int[]{dist[edge[1]], edge[1]});
                    }
                }
            }
        }
        System.out.println(dist[0]);
    }
}