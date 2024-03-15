
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int D = sc.nextInt();
        if (D == 0) {
            System.out.println(X == 0 ? N + 1 : 1);
            return;
        }
        if (D < 0) {
            X = -X;
            D = -D;
        }
        Map<Integer, List<int[]>> memo = new HashMap<>();
        for (int k = 0; k <= N; k++) {
            int l = k * X + (k - 1) * k / 2 * D;
            int r = k * X + (N - k + N - 1) * k / 2 * D;
            if (!memo.containsKey(l % D)) {
                memo.put(l % D, new ArrayList<>());
            }
            memo.get(l % D).add(new int[]{l, r});
        }
        int ans = 0;
        for (List<int[]> LR : memo.values()) {
            Collections.sort(LR, (a, b) -> a[0] - b[0]);
            int cur = -1000000000;
            for (int[] lr : LR) {
                if (cur < lr[0]) {
                    ans += (lr[1] - lr[0]) / D + 1;
                    cur = lr[1];
                }
                if (cur < lr[1]) {
                    ans += (lr[1] - cur) / D;
                    cur = lr[1];
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2019-09-29

### [ABC142D - Disjoint Set of Common Divisors](https://atcoder.jp/contests/abc142/tasks/abc142_d)

#### 题目大意

给定两个正整数A, B，求A和B的最大公约数的约数个数。

#### 解题思路

求最大公约数，然后求约数个数。

#### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long g = gcd(A, B);
        int ans = 0;
        for (long i = 1; i * i <= g; i++) {
            if (g % i == 0) {
                ans++;
                if (i * i != g) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

## 2019-09-30

### [ABC142E - Get Everything](https://atcoder.jp/contests/abc142/tasks/abc142_e)

#### 题目大意

给定一个有N个宝箱的迷宫，每个宝箱有一定的开锁费用，每个宝箱有一定的开锁条件，问至少要花多少钱才能开完所有宝箱。

#### 解题思路

状压DP。

#### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        int[] c = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt();
            c[i] = 0;
            for (int j = 0; j < b[i]; j++) {
                c[i] |= 1 << (sc.nextInt() - 1);
            }
        }
        int[] dp = new int[1 << N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 1 << N; j++) {
                dp[j | c[i]] = Math.min(dp[j | c[i]], dp[j] + a[i]);
            }
        }
        System.out.println(dp[(1 << N) - 1] == Integer.MAX_VALUE ? -1 : dp[(1 << N) - 1]);
    }
}
```

## 2019-10-01

### [ABC142F - Pure](https://atcoder.jp/contests/abc142/tasks/abc142_f)

#### 题目大意

给定一个有向图，问是否存在一个环，使得环上所有点的出度为1。

#### 解题思路

拓扑排序。

#### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] g = new List[N];
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
        }
        int[] in = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j : g[i]) {
                in[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int u = q.poll();
            ans.add(u);
            for (int v : g[u]) {
                in[v]--;
                if (in[v] == 0) {
                    q.add(v);
                }
            }
        }
        if (ans.size() != N) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (g[ans.get(i)].size() != 1) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans.size());
        for (int i = 0; i < N; i++) {
            System.out.println(ans.get(i) + 1);
        }
    }
}
```

## 2019-10-02

### [ABC142G - Pure](https://atcoder.jp/contests/abc142/tasks/abc142_g)

#### 题目大意

给定一个有向图，问是否存在一个环，使得环上所有点的出度为1。

#### 解题思路

