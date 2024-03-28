import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p03560 {
    static class Node implements Comparable<Node> {
        int vertex;
        int cost;

        public Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        List<List<Node>> edge = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 1; i < K; i++) {
            edge.get(i).add(new Node((i + 1) % K, 1));
            edge.get(i).add(new Node((i * 10) % K, 0));
        }

        System.out.println(dijkstra(1, 0, K, edge) + 1);
        scanner.close();
    }

    static int dijkstra(int fro, int to, int v, List<List<Node>> edge) {
        int MAX = Integer.MAX_VALUE;
        int[] dist = new int[v];
        boolean[] check = new boolean[v];
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 0; i < v; i++) {
            dist[i] = MAX;
        }

        dist[fro] = 0;
        pq.offer(new Node(fro, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (check[now.vertex]) {
                continue;
            }

            check[now.vertex] = true;

            for (Node next : edge.get(now.vertex)) {
                int nextDist = dist[now.vertex] + next.cost;
                if (nextDist < dist[next.vertex]) {
                    dist[next.vertex] = nextDist;
                    pq.offer(new Node(next.vertex, dist[next.vertex]));
                }
            }
        }

        return dist[to];
    }
}