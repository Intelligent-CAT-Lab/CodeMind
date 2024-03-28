

```java
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    static final int MAX = 1000000000;
    static int[] dist;
    static boolean[] check;
    static ArrayList<Pair>[] edge;

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        public int compareTo(Pair p) {
            return this.cost - p.cost;
        }
    }

    static int dijkstra(int fro, int to, int v) {
        dist = new int[v];
        check = new boolean[v];
        edge = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            dist[i] = MAX;
            edge[i] = new ArrayList<Pair>();
        }

        for (int i = 1; i < v; i++) {
            edge[i].add(new Pair((i + 1) % v, 1));
            edge[i].add(new Pair((i * 10) % v, 0));
        }

        dist[fro] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        pq.add(new Pair(fro, 0));

        for (int i = 0; i < v; i++) {
            int nowNode = -1;

            while (true) {
                nowNode = pq.poll().node;
                if (!check[nowNode]) {
                    check[nowNode] = true;
                    break;
                }
            }

            for (Pair p : edge[nowNode]) {
                int nextNode = p.node;
                int cost = p.cost;
                int nextDist = dist[nowNode] + cost;
                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.add(new Pair(nextNode, nextDist));
                }
            }
        }

        return dist[to];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(dijkstra(1, 0, K) + 1);
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
import sys

def solve(n):
    if n == 1:
        return 1
    return (solve(n-1) * n) % 1000000007

print(solve(int(sys.stdin.readline())))
```

java code:

```java
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;

    static int solve(int n) {
        if (n == 1) {
            return 1;
        }
        return (solve(n - 1) * n) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
```

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
import sys

def
