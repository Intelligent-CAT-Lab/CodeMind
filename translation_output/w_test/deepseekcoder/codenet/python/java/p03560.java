<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
import heapq

K = int(input())

edge = [[] for i in range(K)]  # (node, cost) list list

for i in range(1, K):
    edge[i].append(( (i+1)%K, 1) )
    edge[i].append( ((i*10)%K, 0) )

# fro ãã to ã¸ã®æç­è·é¢(v ã¯é ç¹æ°)
def dijkstra(fro, to, v):
    MAX = int(1e9)

    dist = [MAX]*v   # fro ããã®è·é¢ãæ ¼ç´ãã
    check = [False]*v  # ãã§ã«ãã®é ç¹ãããèª¿ã¹ããã®ãã©ã°

    dist[fro] = 0
    pq = [(0, fro)]    # (-cost, node)


    # é ç¹ã¯ v åããã®ã§ãv å¨ãã
    for i in range(v):
        # èª¿ã¹æ¸ã¿ã§ãªãé ç¹ã®ãã¡ãæãè¿ãé ç¹ã now ã«å¥ãã
        nowNode = -1        # ãã®ã¿ã¼ã³ã«ãã©ã¼ã«ã¹ãããã¼ã

        while True:
            nowNode = heapq.heappop(pq)[1]  # æå°ã³ã¹ãããè²ªæ¬²ã«åã£ã¦ãã
            if not check[nowNode]:    # ã¾ã ãã§ãã¯ããã¦ããªããã¼ãã ã£ããæ±ºå®
                check[nowNode] = True
                break

        # ãã®é ç¹ãããã©ãçããé ç¹ã®æå ±ãæ´æ°ãã
        for (nextNode, cost) in edge[nowNode]:
            nextDist = dist[nowNode] + cost
            if nextDist < dist[nextNode]:  # æ¢å­ã®éè·¯ããè¿ããªãæ´æ°
                dist[nextNode] = nextDist
                heapq.heappush(pq, (dist[nextNode], nextNode))

    return dist[to]

print(dijkstra(1, 0, K) + 1)

```

### Response:
Here is the Java version of the Python code:

```java
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

public class Main {
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
```

This Java code does the same thing as the Python code. It reads an integer `K` from the standard input, creates a graph with `K` nodes, and then uses Dijkstra's algorithm to find the shortest path from node 1 to node 0. The result is printed to the standard output.
<|EOT|>
