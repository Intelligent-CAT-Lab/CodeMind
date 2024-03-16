
```
import math

A, B, X = map(int, input().split())

if X * 2 >= A * A * B:
    z = (A * A * B - X) / A / A * 2
    d = math.atan(z / A) * 180 / math.pi
else:
    z = (X) / A / B * 2
    d = math.atan(B / z) * 180 / math.pi

print(d)
```

## 02883

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * 1000000007
 */
public class p02883 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int[][] dp = new int[N + 1][M + 1];
            dp[0][0] = 1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (i + 1 <= N) {
                        dp[i + 1][j] += dp[i][j];
                        dp[i + 1][j] %= 1000000007;
                    }
                    if (j + 1 <= M) {
                        dp[i][j + 1] += dp[i][j];
                        dp[i][j + 1] %= 1000000007;
                    }
                }
            }

            System.out.println(dp[N][M]);
        }
    }

}

```

python code:
```
N, M, K = map(int, input().split())

dp = [[0] * (M + 1) for _ in range(N + 1)]
dp[0][0] = 1
for i in range(N):
    for j in range(M):
        if i + 1 <= N:
            dp[i + 1][j] += dp[i][j]
            dp[i + 1][j] %= 1000000007
        if j + 1 <= M:
            dp[i][j + 1] += dp[i][j]
            dp[i][j + 1] %= 1000000007

print(dp[N][M])
```

## 02884

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * Alarm Clock
 */
public class p02884 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int M = sc.nextInt();

            int m = M - 45;
            if (m < 0) {
                m += 60;
                H--;
            }
            if (H < 0) {
                H += 24;
            }

            System.out.println(H + " " + m);
        }
    }

}

```

python code:
```
H, M = map(int, input().split())

m = M - 45
if m < 0:
    m += 60
    H -= 1
if H < 0:
    H += 24

print(H, m)
```

## 02885

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * 1000000007
 */
public class p02885 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int[][] dp = new int[N + 1][M + 1];
            dp[0][0] = 1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (i + 1 <= N) {
                        dp[i + 1][j] += dp[i][j];
                        dp[i + 1][j] %= 1000000007;
                    }
                    if (j + 1 <= M) {
                        dp[i][j + 1] += dp[i][j];
                        dp[i][j + 1] %= 1000000007;
                    }
                }
            }

            System.out.println(dp[N][M]);
        }
    }

}

```

python code:
```
N, M, K = map(int, input().split())

dp = [[0] * (M + 1) for _ in range(N + 1)]
dp[0][0] = 1
for i in range(N):
    for j in range(M):
        if i + 1 <= N:
            dp[i + 1][j] += dp[i][j]
            dp[i + 1][j] %= 1000000007
        if j + 1 <= M:
            dp[i][j + 1] += dp[i][j]
            dp[i][j + 1] %= 1000000007

print(dp[N][M])
```

## 02886

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * 1000000007
 */
public class p02886 {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int[][] dp = new int[N + 1][M + 1];
            dp[0][0] = 1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (i + 1 <= N) {
                        dp[i + 1][j] += dp[i][j];
                        dp[i + 1][j] %= 1000000007;
                    }
                    if (j + 1 <= M) {
                        dp[i][j + 1] += dp[i][j];
                        dp[i][j + 1] %= 1000000007;
                    }
                }
            }

            System.out.println(dp[N][M]);
        }
    }

}

```

python code:
```
N, M, K = map(int, input().split())

dp = [[0] * (M + 1) for _ in range(N + 1)]
dp[0][0] = 1
for i in range(N):
    for j in range(M):
        if i + 1 <= N:
            dp[i + 1][j] += dp[i][j]
            dp[i + 1][j] %= 1000000007
        if j + 1 <= M:
            dp[i][j + 1] += dp[i][j]
            dp[
