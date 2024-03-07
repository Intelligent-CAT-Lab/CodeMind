<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```
import java.util.PriorityQueue;

public class Dijkstra {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        int[][] edge = new int[K][2];

        for (int i = 1; i < K; i++) {
            edge[i][0] = (i + 1) % K;
            edge[i][1] = 1;
        }

        int[] dist = new int[K];
        boolean[] check = new boolean[K];

        dist[0] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);

        while (!pq.isEmpty()) {
            int nowNode = pq.poll();
            if (!check[nowNode]) {
                check[nowNode] = true;
                for (int i = 0; i < K; i++) {
                    int nextNode = edge[nowNode][i];
                    int nextDist = dist[nowNode] + edge[nowNode][i];
                    if (nextDist < dist[nextNode]) {
                        dist[nextNode] = nextDist;
                        pq.add(nextNode);
                    }
                }
            }
        }

        System.out.println(dist[K - 1] + 1);
    }
}
```
This is a Java implementation of the Dijkstra's algorithm for finding the shortest path in a graph. The `edge` array represents the graph, where each element is a pair of integers representing the node and the cost of the edge. The `dist` array represents the distance from the starting node to each other node in the graph. The `check` array is used to keep track of which nodes have already been visited.

The algorithm starts by initializing the `dist` and `check` arrays, and adding the starting node to the priority queue. Then, it repeatedly pops the node with the smallest distance from the priority queue, and updates the distance of its neighbors if necessary. The algorithm stops when the priority queue is empty, which means that all nodes have been visited.

Finally, the algorithm prints the distance from the starting node to the ending node, plus one, which is the shortest path in the graph.</s>
