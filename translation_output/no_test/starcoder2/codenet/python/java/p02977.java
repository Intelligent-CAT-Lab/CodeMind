
```java
import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] root;
    static boolean[] vis;
    static ArrayList<Integer>[] g;
    static ArrayList<int[]> e;

    static void dfs(int u) {
        vis[u] = true;
        root[u] ^= (u - 1) % n + 1;
        for (int v : g[u]) {
            if (vis[v]) continue;
            root[v] = root[u];
            dfs(v);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        e = get(n);
        if (e == null) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        for (int[] p : e) {
            System.out.println(p[0] + " " + p[1]);
        }
        g = new ArrayList[2 * n + 1];
        for (int i = 1; i <= 2 * n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] p : e) {
            g[p[0]].add(p[1]);
            g[p[1]].add(p[0]);
        }
        for (int i = 1; i <= n; i++) {
            vis = new boolean[2 * n + 1];
            root = new int[2 * n + 1];
            dfs(i);
            assert root[n + i] == i;
        }
    }

    static ArrayList<int[]> get(int n) {
        ArrayList<int[]> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n != p) {
            int m = n;
            while (m % 4 != 3) m--;
            for (int i = 1; i < m; i++) {
                e.add(new int[]{i, i + 1});
                e.add(new int[]{n + i, n + i + 1});
            }
            e.add(new int[]{m, n + 1});
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) m--;
                e.add(new int[]{m - 1, m});
                e.add(new int[]{m, n + 1});
                e.add(new int[]{n + 1, n + m - 1});
                e.add(new int[]{n + m - 1, n + m});
            }
            if (n % 4 == 0 || n % 4 == 2) {
                int t = n - 1;
                e.add(new int[]{n, t});
                for (int i = 1; i <= n; i++) {
                    t ^= i;
                    if (t == n) {
                        e.add(new int[]{n + i, n + n});
                        break;
                    }
                }
            }
        }
        return e;
    }
}
```

## 2. 2020-2021 ICPC, NERC, Northern Eurasia (Northeastern European Regional Contest), Online Mirror, ICPC Rules, Teams Preferred

### 2.1. [A. AquaMoon and Two Arrays](https://codeforces.com/contest/1419/problem/A)

#### 2.1.1. 题目

给定两个数组 $a$ 和 $b$，长度均为 $n$，$a$ 中元素互不相同，$b$ 中元素互不相同，$a$ 和 $b$ 均为 $1$ 到 $n$ 的排列。

求一个 $1$ 到 $n$ 的排列 $p$，使得 $\sum_{i=1}^n |a_i-b_{p_i}|$ 最小。

$n \le 10^5$

#### 2.1.2. 题解

$a$ 和 $b$ 均为 $1$ 到 $n$ 的排列，所以 $a$ 和 $b$ 中元素的相对顺序是不变的。

假设 $a$ 中 $i$ 位置的元素为 $x$，$b$ 中 $i$ 位置的元素为 $y$，那么 $p$ 中 $i$ 位置的元素为 $x$ 或 $y$。

假设 $p$ 中 $i$ 位置的元素为 $x$，那么 $p$ 中 $j$ 位置的元素为 $y$，那么 $|a_i-b_{p_i}|+|a_j-b_{p_j}|$ 最小的情况是 $a_i=b_y$，$a_j=b_x$。

所以 $p$ 中 $i$ 位置的元素为 $x$，那么 $p$ 中 $j$ 位置的元素为 $y$，那么 $|a_i-b_{p_i}|+|a_j-b_{p_j}|$ 最小的情况是 $a_i=b_y$，$a_j=b_x$。

所以 $p$ 中 $i$ 位置的元素为 $x$，那么 $p$ 中 $j$ 位置的元素为 $y$，那么 $|a_i-b_{p_i}|+|a_j-b_{p_j}|$ 最小的情况是 $a_i=b_y$，$a_j=b_x$。

所以 $p$ 中 $i$ 位置的元素为 $x$，那么 $p$ 中 $j$ 位置的元素为 $y$，那么 $|a_i-b_{p_i}|+|a_j-b_{p_j}|$ 
