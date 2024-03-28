import java.util.*;

public class p03560 {
    static class Edge {
        int node, cost;
        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static int K;
    static ArrayList<Edge>[] edge;

    static int dijkstra(int fro, int to, int v) {
        int MAX = (int)1e9;
        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        Arrays.fill(dist, MAX);
        dist[fro] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, fro});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int nowNode = now[1];

            if (check[nowNode]) continue;
            check[nowNode] = true;

            for (Edge e : edge[nowNode]) {
                int nextNode = e.node;
                int nextDist = dist[nowNode] + e.cost;

                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.add(new int[]{dist[nextNode], nextNode});
                }
            }
        }

        return dist[to] + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();

        edge = new ArrayList[K];
        for (int i = 0; i < K; i++) {
            edge[i] = new ArrayList<>();
        }

        for (int i = 1; i < K; i++) {
            edge[i].add(new Edge((i + 1) % K, 1));
            edge[i].add(new Edge((i * 10) % K, 0));
        }

        System.out.println(dijkstra(1, 0, K));
    }
}