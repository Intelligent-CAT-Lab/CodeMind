import java.util.*;

class Node implements Comparable<Node> {
    int node, cost;

    Node(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    public int compareTo(Node other) {
        return cost - other.cost;
    }
}

public class p03560 {
    static int K;
    static ArrayList<Node>[] edge;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();

        edge = new ArrayList[K];
        for (int i = 0; i < K; i++) {
            edge[i] = new ArrayList<>();
        }

        for (int i = 1; i < K; i++) {
            edge[i].add(new Node((i+1)%K, 1));
            edge[i].add(new Node((i*10)%K, 0));
        }

        System.out.println(dijkstra(1, 0) + 1);
    }

    static int dijkstra(int fro, int to) {
        int MAX = (int)1e9;

        int[] dist = new int[K];
        boolean[] check = new boolean[K];

        Arrays.fill(dist, MAX);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(fro, 0));

        dist[fro] = 0;

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (check[now.node]) continue;
            check[now.node] = true;

            for (Node next : edge[now.node]) {
                if (dist[now.node] + next.cost < dist[next.node]) {
                    dist[next.node] = dist[now.node] + next.cost;
                    pq.add(new Node(next.node, dist[next.node]));
                }
            }
        }

        return dist[to];
    }
}