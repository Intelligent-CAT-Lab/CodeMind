<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Dijkstra {
    private static final int INF = Integer.MAX_VALUE;

    public static int dijkstra(int fro, int to, int v) {
        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        Arrays.fill(dist, INF);
        Arrays.fill(check, false);

        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, fro});

        for (int i = 0; i < v; i++) {
            int nowNode = -1;
            while (!pq.isEmpty()) {
                int[] curr = pq.poll();
                nowNode = curr[1];

                if (!check[nowNode]) {
                    check[nowNode] = true;
                    break;
                }
            }

            for (int[] edge : graph[nowNode]) {
                int nextNode = edge[0];
                int cost = edge[1];
                int nextDist = dist[nowNode] + cost;

                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.add(new int[]{nextDist, nextNode});
                }
            }
        }

        return dist[to];
    }

    private static List<List<int[]>> graph = new ArrayList<>();

    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            List<int[]> edge = new ArrayList<>();
            edge.add(new int[]{((i + 1) % K), 1});
            edge.add(new int[]{((i * 10) % K), 0});
            graph.add(edge);
        }

        int fro = Integer.parseInt(args[1]);
        int to = Integer.parseInt(args[2]);
        int v = K;

        int result = dijkstra(fro, to, v) + 1;
        System.out.println(result);
    }
}
```</s>
