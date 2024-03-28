Here is the code translated from Python to Java:

```java
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DijkstraHeap {

    static final int MAX = (int) 1e9;
    
    static class Edge {
        int node;
        int cost;

        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        // Create an array of lists to store edges
        PriorityQueue<Edge>[] edge = new PriorityQueue[K];
        for (int i = 0; i < K; i++) {
            edge[i] = new PriorityQueue<>((e1, e2) -> e1.cost - e2.cost);
        }

        for (int i = 1; i < K; i++) {
            edge[i].add(new Edge((i + 1) % K, 1));
            edge[i].add(new Edge((i * 10) % K, 0));
        }

        System.out.println(dijkstra(1, 0, K, edge) + 1);
    }

    // Dijkstra's algorithm from "fro" to "to" with "v" vertices
    static int dijkstra(int fro, int to, int v, PriorityQueue<Edge>[] edge) {
        int[] dist = new int[v];
        Arrays.fill(dist, MAX);
        boolean[] check = new boolean[v];
        
        dist[fro] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>((e1, e2) -> e1.cost - e2.cost);
        pq.add(new Edge(fro, 0));

        while (!pq.isEmpty()) {
            Edge nowEdge = pq.poll();
            int nowNode = nowEdge.node;

            if (check[nowNode])
                continue;

            check[nowNode] = true;

            for (Edge e : edge[nowNode]) {
                int nextNode = e.node;
                int cost = e.cost;
                int nextDist = dist[nowNode] + cost;
                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.add(new Edge(nextNode, dist[nextNode]));
                }
            }
        }
        return dist[to];
    }
}
```

Please note that the code assumes Java 8 or higher due to the use of lambda expressions in the Priority Queue comparator. You can compile and run this code, providing the integer "6" as input, to receive the expected output of "3".
