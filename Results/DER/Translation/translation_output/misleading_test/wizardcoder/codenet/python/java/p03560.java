Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
80

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
```java
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        int[][] edge = new int[K][K];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                edge[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 1; i < K; i++) {
            edge[i][(i+1)%K] = 1;
            edge[i][(i*10)%K] = 0;
        }

        int result = dijkstra(edge, 1, K-1);
        System.out.println(result);
    }

    public static int dijkstra(int[][] edge, int fro, int to) {
        int v = edge.length;
        int MAX = Integer.MAX_VALUE;

        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        for (int i = 0; i < v; i++) {
            dist[i] = MAX;
            check[i] = false;
        }

        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, fro});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int nowNode = now[1];
            if (check[nowNode]) {
                continue;
            }
            check[nowNode] = true;

            for (int i = 0; i < v; i++) {
                if (edge[nowNode][i] == MAX) {
                    continue;
                }
                int nextDist = dist[nowNode] + edge[nowNode][i];
                if (nextDist < dist[i]) {
                    dist[i] = nextDist;
                    pq.offer(new int[]{dist[i], i});
                }
            }
        }

        return dist[to];
    }
}
```<|endoftext|>
