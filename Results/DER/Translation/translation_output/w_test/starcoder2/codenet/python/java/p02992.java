

```java
import java.util.*;
import java.io.*;

public class Main {
    static int MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(solve(N, K));
    }

    static int solve(int N, int K) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns.add(i);
            ns.add(N / i);
        }
        Collections.sort(ns);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }
        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            l[i] = N / ns.get(i) - N / ns.get(i + 1);
        }

        int[][] dp = new int[K + 1][ns.size()];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.size(); j++) {
                int nj = m.get(N / ns.get(j));
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int ans = 0;
        for (int i = 0; i < ns.size(); i++) {
            ans += dp[K][i];
        }
        return ans % MOD;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
```
/content/post/2020-01-01-atcoder-abc151.md
---
title: "AtCoder ABC151"
date: 2020-01-01T00:00:00+09:00
slug: atcoder-abc151
draft: false

categories: ["AtCoder"]
tags: ["AtCoder", "Python"]
---

[AtCoder ABC151](https://atcoder.jp/contests/abc151)

<!--more-->

## A

```python
c = input()
print(chr(ord(c) + 1))
```

## B

```python
n, k, m = map(int, input().split())
a = list(map(int, input().split()))

s = sum(a)
if s + k < n * m:
    print(-1)
elif s + k >= n * m:
    print(max(0, n * m - s))
```

## C

```python
n, m = map(int, input().split())
ps = [list(map(int, input().split())) for _ in range(m)]

ac = [False] * n
wa = [0] * n

for p, s in ps:
    p -= 1
    if ac[p]:
        continue
    if s == 1:
        ac[p] = True
    else:
        wa[p] += 1

print(sum(wa))
print(sum(ac))
```

## D

```python
from collections import deque

h, w = map(int, input().split())
s = [input() for _ in range(h)]

def bfs(sx, sy):
    q = deque([(sx, sy)])
    dist = [[-1] * w for _ in range(h)]
    dist[sx][sy] = 0
    while q:
        x, y = q.popleft()
        for dx, dy in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
            nx, ny = x + dx, y + dy
            if not (0 <= nx < h and 0 <= ny < w):
                continue
            if s[nx][ny] == '#':
                continue
            if dist[nx][ny] != -1:
                continue
            dist[nx][ny] = dist[x][y] + 1
            q.append((nx, ny))
    return dist

ans = 0
for i in range(h):
    for j in range(w):
        if s[i][j] == '#':
            continue
        dist = bfs(i, j)
        for k in range(h):
            for l in range(w):
                if s[k][l] == '#':
                    continue
                ans = max(ans, dist[k][l])
print(ans)
```
/content/post/2020-01-01-atcoder-abc152.md
---
title: "AtCoder ABC152"
date: 2020-01-01T00:00:00+09:00
slug: atcoder-abc15
