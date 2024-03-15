import java.util.*;

public class p03560 {
    private static final int MAX = (int)1e9;
    private static int K;
    private static List<List<Node>> edge;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();
        edge = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 1; i < K; i++) {
            edge.get(i).add(new Node((i + 1) % K, 1));
            edge.get(i).add(new Node((i * 10) % K, 0));
        }

        System.out.println(dijkstra(1, 0, K) + 1);
        scanner.close();
    }

    private static int dijkstra(int fro, int to, int v) {
        int[] dist = new int[v];
        boolean[] check = new boolean[v];
        Arrays.fill(dist, MAX);

        dist[fro] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(fro, dist[fro]));

        while (!pq.isEmpty()) {
            Node nowNode = pq.poll(); // Extract the minimum cost node that has not been checked yet
            if (!check[nowNode.node]) {
                check[nowNode.node] = true;  // Mark the node as checked
                // Update the distance information of the nodes that the focus node can reach
                for (Node nextPair : edge.get(nowNode.node)) {
                    int nextNode = nextPair.node, cost = nextPair.cost;
                    int nextDist = dist[nowNode.node] + cost;
                    if (nextDist < dist[nextNode]) { // If the new path is shorter, update distance
                        dist[nextNode] = nextDist;
                        pq.add(new Node(nextNode, dist[nextNode]));
                    }
                }
            }
        }

        return dist[to];
    }

    private static class Node implements Comparable<Node> {
        int node, cost;

        Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost); // Sort based on cost
        }
    }
}