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

        System.out.println(dijkstra(1, 0) + 1);
    }

    static int dijkstra(int fro, int to) {
        int MAX = (int)1e9;

        int[] dist = new int[K];
        boolean[] check = new boolean[K];

        Arrays.fill(dist, MAX);

        dist[fro] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new Edge(fro, 0));

        while (!pq.isEmpty()) {
            Edge now = pq.poll();
            if (check[now.node]) continue;
            check[now.node] = true;

            for (Edge next : edge[now.node]) {
                int nextDist = dist[now.node] + next.cost;
                if (nextDist < dist[next.node]) {
                    dist[next.node] = nextDist;
                    pq.add(new Edge(next.node, dist[next.node]));
                }
            }
        }

        return dist[to];
    }
}