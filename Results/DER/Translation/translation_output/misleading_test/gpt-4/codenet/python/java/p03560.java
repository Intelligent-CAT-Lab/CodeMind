Here's the equivalent Java code for the provided Python snippet using Java's `PriorityQueue` class to implement the heap functionality:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
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
```

Please note the following when using the Java code:

1. The Java class `PriorityQueue` is used to implement the min-heap, while in Python, `heapq` is used.
2. In Java, we need to declare the class `Node` which implements `Comparable` to dictate how elements are compared within the heap.
3. Java is strongly typed, so all variables need a type declaration.
4. User input and output are handled with `Scanner` and `System.out.println`, respectively.
5. Java doesn't support defining and executing functions like Python in the global scope, so the logic is structured into a `main` method and other static methods.
6. Java doesn't have a built-in pair or tuple class, which is why we need to create a custom `Node` class.
7. Exception handling is necessary for real-world code when working with I/O operations in Java, which is omitted here for brevity and clarity.

Make sure to include the above Java code in a file `Main.java`, and compile and run it using a JDK to get the desired output.
