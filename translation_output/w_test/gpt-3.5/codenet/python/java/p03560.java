```java
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestPath {
    public static void main(String[] args) {
        int K = 6;

        ArrayList<int[]>[] edge = new ArrayList[K];
        for (int i = 0; i < K; i++) {
            edge[i] = new ArrayList<>();
        }

        for (int i = 1; i < K; i++) {
            edge[i].add(new int[]{(i + 1) % K, 1});
            edge[i].add(new int[]{(i * 10) % K, 0});
        }

        System.out.println(dijkstra(1, 0, K) + 1);
    }

    private static int dijkstra(int fro, int to, int v) {
        int MAX = (int) 1e9;

        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        for (int i = 0; i < v; i++) {
            dist[i] = MAX;
        }

        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, fro});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int nowNode = current[1];

            if (!check[nowNode]) {
                check[nowNode] = true;
                for (int[] next : edge[nowNode]) {
                    int nextNode = next[0];
                    int cost = next[1];

                    int nextDist = dist[nowNode] + cost;
                    if (nextDist < dist[nextNode]) {
                        dist[nextNode] = nextDist;
                        pq.offer(new int[]{dist[nextNode], nextNode});
                    }
                }
            }
        }

        return dist[to];
    }
}
```

