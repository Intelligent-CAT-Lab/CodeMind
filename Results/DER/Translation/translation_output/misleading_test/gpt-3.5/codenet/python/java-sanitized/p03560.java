import java.util.*;

public class p03560 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        List<List<Pair>> edge = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 1; i < K; i++) {
            edge.get(i).add(new Pair((i + 1) % K, 1));
            edge.get(i).add(new Pair((i * 10) % K, 0));
        }

        System.out.println(dijkstra(1, 0, K, edge) + 1);
    }

    static class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static int dijkstra(int from, int to, int v, List<List<Pair>> edge) {
        int MAX = (int) 1e9;

        int[] dist = new int[v];
        Arrays.fill(dist, MAX);

        boolean[] check = new boolean[v];

        dist[from] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.cost));
        pq.offer(new Pair(0, from));

        for (int i = 0; i < v; i++) {
            int nowNode = -1;

            while (true) {
                Pair node = pq.poll();
                nowNode = node.node;
                if (!check[nowNode]) {
                    check[nowNode] = true;
                    break;
                }
            }

            for (Pair edgePair : edge.get(nowNode)) {
                int nextNode = edgePair.node;
                int cost = edgePair.cost;
                int nextDist = dist[nowNode] + cost;
                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.offer(new Pair(nextDist, nextNode));
                }
            }
        }

        return dist[to];
    }
}