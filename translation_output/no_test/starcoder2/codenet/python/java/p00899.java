
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String[] S = new String[n];
            for (int i = 0; i < n; i++) {
                S[i] = sc.next();
            }

            int[] dup = new int[n];
            for (int i = 0; i < n; i++) {
                String si = S[i];
                for (int j = i + 1; j < n; j++) {
                    String sj = S[j];
                    if (si.indexOf(sj) != -1) {
                        dup[j] = 1;
                    }
                    if (sj.indexOf(si) != -1) {
                        dup[i] = 1;
                    }
                }
            }
            List<String> S2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dup[i] == 0) {
                    S2.add(S[i]);
                }
            }
            n -= Arrays.stream(dup).sum();

            int[][] P = new int[n][n];
            for (int i = 0; i < n; i++) {
                String si = S2.get(i);
                int l = si.length();
                for (int j = 0; j < n; j++) {
                    String sj = S2.get(j);
                    int pos = l;
                    for (int k = 0; k < l; k++) {
                        if (sj.startsWith(si.substring(k))) {
                            pos = k;
                            break;
                        }
                    }
                    P[i][j] = sj.length() - (l - pos);
                }
            }

            int ALL = (1 << n) - 1;
            int up = 300;
            Map<String, Integer> memo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                memo.put(String.format("%d %d", ALL, i), 0);
            }
            int dfs(int state, int i) {
                String key = String.format("%d %d", state, i);
                if (memo.containsKey(key)) {
                    return memo.get(key);
                }
                int res = up;
                for (int j = 0; j < n; j++) {
                    if (((state >> j) & 1) < 1) {
                        res = Math.min(res, dfs(state | (1 << j), j) + P[i][j]);
                    }
                }
                memo.put(key, res);
                return res;
            }
            System.out.println(Arrays.stream(S2).mapToInt(s -> dfs(1 << S2.indexOf(s), S2.indexOf(s)) + s.length()).min().getAsInt());
        }
    }
}
```

## 10025 - The Problem with the Problem Setter

### 题目大意

给定一个数列，求出一个数列的子序列，使得这个子序列的和最大，且这个子序列的和不能被3整除。

### 解题思路

首先，我们可以用动态规划求出这个数列的最大子序列和。

然后，我们可以用二分查找来求出这个数列的最小子序列和。

最后，我们可以用动态规划求出这个数列的最大子序列和，且这个子序列的和不能被3整除。

### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] dp = new int[n];
            dp[0] = a[0];
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i - 1] + a[i], a[i]);
            }
            int max = Arrays.stream(dp).max().getAsInt();

            int[] dp2 = new int[n];
            dp2[0] = a[0];
            for (int i = 1; i < n; i++) {
                dp2[i] = Math.min(dp2[i - 1] + a[i], a[i]);
            }
            int min = Arrays.stream(dp2).min().getAsInt();

            int[] dp3 = new int[n];
            dp3[0] = a[0];
            for (int i = 1; i < n; i++) {
                dp3[i] = Math.max(dp3[i - 1] + a[i], a[i]);
            }
            int max2 = Arrays.stream(dp3).max().getAsInt();

            int[] dp4 = new int[n];
            dp4[0] = a[0];
            for (int i = 1; i < n; i++) {
                dp4[i] = Math.min(dp4[i - 1] + a[i], a[i]);
            }
            int min2 = Arrays.stream(dp4).min().getAsInt();

            int ans = max;
            if (max2 % 3 != 0) {
                ans = Math.max(ans, max2);
            }
            if (min2 % 3 != 0) {
                ans = Math.max(ans, min2);
            }
            if (min % 3 != 0) {
                ans = Math.max(ans, min);
            }
            System.out.println(ans);
        }
    }
}
```

## 10026 - Shoemaker's Problem

### 题目大意

给定n个工人，每个工人有m个工作，每个工作有完成时间和难度，求出一个工作的安排，使得完成时间最短。

### 解题思路

首先，我们可以用动态规划求出这个问题的答案。

然后，我们可以用贪心算法求出这个问题的答案。

### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            if (t > 0) {
                System.out.println();
            }
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j
