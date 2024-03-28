
```java
import java.util.*;
import java.io.*;

public class Main {
    static int MOD = 1000000007;
    static int N, K;
    static int[] ns;
    static int[] l;
    static int[][] dp;
    static Map<Integer, Integer> m;

    static void solve() {
        ns = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns[i] = i;
            ns[N / i] = N / i;
        }
        Arrays.sort(ns);

        m = new HashMap<>();
        for (int i = 0; i < ns.length; i++) {
            m.put(ns[i], i);
        }

        l = new int[ns.length];
        for (int i = 0; i < ns.length - 1; i++) {
            l[i] = (N / ns[i]) - (N / ns[i + 1]);
        }

        dp = new int[K + 1][ns.length];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.length - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
            }
            for (int j = 0; j < ns.length; j++) {
                int nj = m.get(N / ns[j]);
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        int ans = 0;
        for (int i = 0; i < ns.length; i++) {
            ans += dp[K][i];
        }
        System.out.println(ans % MOD);
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        solve();
    }

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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
```

## 参考

- [Pythonで解くAtCoderの問題をJavaで解く](https://qiita.com/c-yan/items/11111111111111111111)
- [Pythonで解くAtCoderの問題をJavaで解く（その2）](https://qiita.com/c-yan/items/11111111111111111111)


## 参考

- [Pythonで解くAtCoderの問題をJavaで解く](https://qiita.com/c-yan/items/11111111111111111111)
- [Pythonで解くAtCoderの問題をJavaで解く（その2）](https://qiita.com/c-yan/items/11111111111111111111)

## 類題

- [ABC142 D - Disjoint Set of Common Divisors](https://atcoder.jp/contests/abc142/tasks/abc142_d)
/ABC142/D/README.md
# D - Disjoint Set of Common Divisors

## 問題概要

2つの正整数A, Bの最大公約数を求めよ。

## 制約

- 2 ≤ A, B ≤ 10^12

## 解法

A, Bの最大公約数を求める問題。

A, Bの最大公約数を求める方法はいくつかあるが、今回は素因数分解を利用する。

A, Bの素因数分解をそれぞれ行い、素因数の集合を求める。

素因数の集合の要素数が最大公約数となる。

## 実装

```java
import java.util.*;
import java.io.*;

public class Main {
    static long A, B;

    static void solve() {
        List<Long> a = primeFactorize(A);
        List<Long> b = primeFactorize(B);

        Set<Long> s = new HashSet<>();
        for (long i : a) {
            s.add(i);
        }
        for (long i : b) {
            s.add(i);
        }

        System.out.println(s.size() + 1);
    }

    static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();
        solve();
    }

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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
```

## 解説

### 素因数分解
