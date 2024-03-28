

```java
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int to;
    int cost;

    public Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

class Main {
    static int K;
    static ArrayList<Edge>[] edge;
    static int[] dist;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();

        edge = new ArrayList[K];
        for (int i = 0; i < K; i++) {
            edge[i] = new ArrayList<Edge>();
        }

        for (int i = 1; i < K; i++) {
            edge[i].add(new Edge((i + 1) % K, 1));
            edge[i].add(new Edge((i * 10) % K, 0));
        }

        dist = new int[K];
        Arrays.fill(dist, Integer.MAX_VALUE);
        check = new boolean[K];

        dist[1] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        pq.add(new Edge(1, 0));

        for (int i = 0; i < K; i++) {
            Edge now = pq.poll();
            int nowNode = now.to;
            if (check[nowNode]) {
                continue;
            }
            check[nowNode] = true;

            for (Edge e : edge[nowNode]) {
                int nextNode = e.to;
                int nextDist = dist[nowNode] + e.cost;
                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.add(new Edge(nextNode, nextDist));
                }
            }
        }

        System.out.println(dist[0] + 1);
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
import math

MOD = int(input())

def modpow(a, b):
    if b == 0:
        return 1
    elif b % 2 == 0:
        d = modpow(a, b//2)
        return (d*d) % MOD
    else:
        return (a * modpow(a, b-1)) % MOD

print(modpow(10, MOD-2))
```

java code:

```java
import java.util.Scanner;

class Main {
    static int MOD;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MOD = sc.nextInt();

        System.out.println(modpow(10, MOD - 2));
    }

    static int modpow(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            int d = modpow(a, b / 2);
            return (d * d) % MOD;
        } else {
            return (a * modpow(a, b - 1)) % MOD;
        }
    }
}
```

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

