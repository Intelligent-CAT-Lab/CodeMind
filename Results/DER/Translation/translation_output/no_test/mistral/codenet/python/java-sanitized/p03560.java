import java.util.*;

public class p03560 {
    private static final int INF = Integer.MAX_VALUE;

    public static int dijkstra(int fro, int to, int v) {
        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        Arrays.fill(dist, INF);
        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, fro});

        for (int i = 0; i < v; i++) {
            int nowNode = -1;
            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                nowNode = curr[1];

                if (!check[nowNode]) {
                    check[nowNode] = true;
                    break;
                }
            }

            for (int[] edge : graph[nowNode]) {
                int nextNode = edge[0];
                int cost = edge[1];
                int nextDist = dist[nowNode] + cost;

                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.add(new int[]{nextDist, nextNode});
                }
            }
        }

        return dist[to];
    }

    private static List<List<int[]>> graph = new ArrayList<>();

    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            List<int[]> edge = new ArrayList<>();
            edge.add(new int[]{((i + 1) % K), 1});
            edge.add(new int[]{((i * 10) % K), 0});
            graph.add(edge);
        }

        int fro = Integer.parseInt(args[1]);
        int to = Integer.parseInt(args[2]);
        int v = Integer.parseInt(args[3]);

        int result = dijkstra(fro, to, v);
        System.out.println(result + 1);
    }
}