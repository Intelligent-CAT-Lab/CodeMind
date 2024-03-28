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
    static ArrayList<ArrayList<Node>> edge;

    static int dijkstra(int fro, int to, int v) {
        int MAX = (int)1e9;
        int[] dist = new int[v];
        boolean[] check = new boolean[v];
        PriorityQueue<Node> pq = new PriorityQueue<>();

        Arrays.fill(dist, MAX);
        dist[fro] = 0;
        pq.add(new Node(fro, 0));

        for (int i = 0; i < v; i++) {
            int nowNode = -1;
            while (true) {
                Node node = pq.poll();
                if (!check[node.node]) {
                    check[node.node] = true;
                    nowNode = node.node;
                    break;
                }
            }

            for (Node next : edge.get(nowNode)) {
                int nextDist = dist[nowNode] + next.cost;
                if (nextDist < dist[next.node]) {
                    dist[next.node] = nextDist;
                    pq.add(new Node(next.node, dist[next.node]));
                }
            }
        }

        return dist[to] + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();

        edge = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 1; i < K; i++) {
            edge.get(i).add(new Node((i+1)%K, 1));
            edge.get(i).add(new Node((i*10)%K, 0));
        }

        System.out.println(dijkstra(1, 0, K));
    }
}