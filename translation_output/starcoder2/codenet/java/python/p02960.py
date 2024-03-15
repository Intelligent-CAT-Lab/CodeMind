
```
import sys

def main():
    S = sys.stdin.readline().strip()
    d = [int(x) if x != '?' else -1 for x in S]
    dp = [0] * 13
    dp[0] = 1
    base = 1
    for i in range(len(d) - 1, -1, -1):
        next_dp = [0] * 13
        if d[i] == -1:
            for k in range(10):
                for j in range(13):
                    next_dp[(k * base + j) % 13] += dp[j]
                    next_dp[(k * base + j) % 13] %= 1000000007
        else:
            k = d[i]
            for j in range(13):
                next_dp[(k * base + j) % 13] += dp[j]
                next_dp[(k * base + j) % 13] %= 1000000007
        dp = next_dp
        base *= 10
        base %= 13
    print(dp[5])

if __name__ == '__main__':
    main()
```

## 02961

### 题目

[02961](https://www.acmicpc.net/problem/2961)

### 题解

```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p02961 {
    public static void main(String[] args) throws Exception {
        p02961 main = new p02961();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] s = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < (1 << N); i++) {
            int s_sum = 1;
            int b_sum = 0;
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) != 0) {
                    s_sum *= s[j];
                    b_sum += b[j];
                }
            }
            ans = Math.min(ans, Math.abs(s_sum - b_sum));
        }
        System.out.println(ans);
    }
}
```

```
import sys

def main():
    N = int(sys.stdin.readline())
    s = []
    b = []
    for _ in range(N):
        s_i, b_i = map(int, sys.stdin.readline().split())
        s.append(s_i)
        b.append(b_i)
    ans = float('inf')
    for i in range(1, 1 << N):
        s_sum = 1
        b_sum = 0
        for j in range(N):
            if (i & (1 << j)) != 0:
                s_sum *= s[j]
                b_sum += b[j]
        ans = min(ans, abs(s_sum - b_sum))
    print(ans)

if __name__ == '__main__':
    main()
```
 1000000007;
        }
        System.out.println(dp[N]);
    }
}
```

```
import sys

def main():
    N = int(sys.stdin.readline())
    dp = [0] * (N + 1)
    dp[0] = 1
    for i in range(1, N + 1):
        for j in range(1, 7):
            if i - j >= 0:
                dp[i] += dp[i - j]
                dp[i] %= 1000000007
    print(dp[N])

if __name__ == '__main__':
    main()
```
/source/_posts/2019-08-25-python-java-code-translation.md
---
title: python-java-code-translation
date: 2019-08-25 16:00:00
tags:
- python
- java
---

## 02960

### 题目

[02960](https://www.acmicpc.net/problem/2960)

### 题解

```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p02960 {
    public static void main(String[] args) throws Exception {
        p02960 main = new p02960();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] d = S.toCharArray();
        long[] dp = new long[13];
        dp[0] = 1;
        int base = 1;
        for (int i = d.length - 1; 0 <= i; i--) {
            long[] next_dp = new long[13];
            if (d[i] == '?') {
                for (int k = 0; k < 10; k++) {
                    for (int j = 0; j < 13; j++) {
                        next_dp[(k * base + j) % 13] += dp[j];
                        next_dp[(k * base + j) % 13] %= 1000000007;
                    }
                }
            } else {
                int k = d[i] - '0';
                for (int j = 0; j < 13; j++) {
                    next_dp[(k * base + j) % 13] += dp[j];
                    next_dp[(k * base + j) % 13] %= 1000000007;
                }
            }
            dp = next_dp;
            base *= 10;
            base %= 13;
        }
        System.out.println(dp[5]);
    }
}
```

```
import sys

def main():
    S = sys.stdin.readline().strip()
    d = [int(x) if x != '?' else -1 for x in S]
    dp = [0] * 13
    dp[0] = 1
    base = 1
    for i in range(len(d) - 1, -1, -1):
        next_dp = [0
