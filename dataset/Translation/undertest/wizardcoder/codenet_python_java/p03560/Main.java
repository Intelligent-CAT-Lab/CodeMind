import java.util.PriorityQueue;
import java.util.Scanner;

public class p03560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        int[][] edge = new int[K][K];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                edge[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 1; i < K; i++) {
            edge[i][(i+1)%K] = 1;
            edge[i][(i*10)%K] = 0;
        }

        int result = dijkstra(edge, 1, K-1);
        System.out.println(result);
    }

    public static int dijkstra(int[][] edge, int fro, int to) {
        int v = edge.length;
        int MAX = Integer.MAX_VALUE;

        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        for (int i = 0; i < v; i++) {
            dist[i] = MAX;
            check[i] = false;
        }

        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, fro});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int nowNode = now[1];
            if (check[nowNode]) {
                continue;
            }
            check[nowNode] = true;

            for (int i = 0; i < v; i++) {
                if (edge[nowNode][i] == MAX) {
                    continue;
                }
                int nextDist = dist[nowNode] + edge[nowNode][i];
                if (nextDist < dist[i]) {
                    dist[i] = nextDist;
                    pq.offer(new int[]{dist[i], i});
                }
            }
        }

        return dist[to];
    }
}