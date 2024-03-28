

```python
MOD = 1000000007
def calcComb(n, k):
    if k > n - k:
        return calcComb(n, n - k)
    ansMul = 1
    ansDiv = 1
    for i in range(k):
        ansMul *= (n - i)
        ansDiv *= (i + 1)
        ansMul %= MOD
        ansDiv %= MOD
    ans = ansMul * pow(ansDiv, MOD - 2)
    ans %= MOD
    return ans

def pow(x, n):
    ans = 1
    while n > 0:
        if (n & 1) == 1:
            ans = ans * x % MOD
        x = x * x % MOD
        n >>= 1
    return ans

n, m = map(int, input().split())
res = m
ans = 1
for i in range(2, int(res ** 0.5) + 1):
    cnt = 0
    while res % i == 0:
        cnt += 1
        res //= i
    ans *= calcComb(cnt + n - 1, n - 1)
    ans %= MOD
if res != 1:
    ans *= calcComb(n, 1)
    ans %= MOD
print(ans)
```

## 03254

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
public class p03254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans += i;
                if (i * i != n) {
                    ans += n / i;
                }
            }
        }
        System.out.println(ans);
    }
}

```

python code:

```python
n = int(input())
ans = 0
for i in range(1, int(n ** 0.5) + 1):
    if n % i == 0:
        ans += i
        if i * i != n:
            ans += n // i
print(ans)
```

## 03255

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10
1 2 1
1 3 1
1 4 1
1 5 1
1 6 1
1 7 1
1 8 1
1 9 1
1 10 1
2 3 1
2 4 1
2 5 1
2 6 1
2 7 1
2 8 1
2 9 1
2 10 1
3 4 1
3 5 1
3 6 1
3 7 1
3 8 1
3 9 1
3 10 1
4 5 1
4 6 1
4 7 1
4 8 1
4 9 1
4 10 1
5 6 1
5 7 1
5 8 1
5 9 1
5 10 1
6 7 1
6 8 1
6 9 1
6 10 1
7 8 1
7 9 1
7 10 1
8 9 1
8 10 1
9 10 1

Expected output:
10


```
import java.util.*;
public class p03255 {
    static int N = 100000;
    static int INF = 1000000000;
    static int[] dist = new int[N];
    static int[] prev = new int[N];
    static boolean[] used = new boolean[N];
    static int[] cost = new int[N];
    static int[] to = new int[N];
    static int[] next = new int[N];
    static int[] head = new int[N];
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            head[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            addEdge(a, b, c);
            addEdge(b, a, c);
        }
        int s = 0;
        int t = n - 1;
        for (int i = 0; i < n; i++) {
            dist[i] = INF;
        }
        dist[s] = 0;
        while (true) {
            int v = -1;
            for (int u = 0; u < n; u++) {
                if (!used[u] && (v == -1 || dist[u] < dist[v])) {
                    v = u;
                }
            }
            if (v == -1) {
                break;
            }
            used[v] = true;
            for (int e = head[v]; e != -1; e = next[e]) {
                int u = to[e];
                if (dist[u] > dist[v] + cost[e]) {
                    dist[u] = dist[v] + cost[e];
                    prev[u] = v;
                }
            }
        }
        System.out.println(dist[t]);
    }
    public static void addEdge(int from, int to, int cost) {
        to[cnt] = to;
        cost[cnt] = cost;
        next[cnt] = head[from];
        head[from] = cnt++;
    }
}

```

python code:

```python
N = 100000
INF = 1000000000
dist = [INF] * N
prev = [0] * N
used = [False] * N
cost = [0] * N
to = [0] * N
next = [0] * N
head = [-1] * N
cnt = 
