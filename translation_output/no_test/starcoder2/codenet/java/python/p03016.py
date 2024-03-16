
```
import sys

def mult(a, b, M):
    r = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    for i in range(3):
        for j in range(3):
            for k in range(3):
                r[i][j] += a[i][k] * b[k][j] % M
                if r[i][j] >= M:
                    r[i][j] -= M
    return r

def modpow(m, c, M):
    if c == 0:
        return [[1, 0, 0], [0, 1, 0], [0, 0, 1]]
    if c == 1:
        return m
    if c % 2 == 0:
        m1 = modpow(m, c // 2, M)
        return mult(m1, m1, M)
    else:
        m1 = modpow(m, c - 1, M)
        return mult(m1, m, M)

def main():
    L, A, B, M = map(int, sys.stdin.readline().split())
    m = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    for i in range(2):
        m[1][i] = 1
    for i in range(1, 3):
        m[2][i] = 1
    res = [0, A % M, B % M]
    k = 10
    l = 0
    while A > k:
        k *= 10
    while l < L:
        m[0][0] = k % M
        r = min((k - A - 1) // B, L - 1)
        res = mult(res, modpow(m, r - l + 1, M), M)
        l = r + 1
        k *= 10
    print(res[0])

main()
```

## 03017

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03017 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int K = scanner.nextInt();

    int[][] a = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        a[i][j] = scanner.nextInt();
      }
    }

    int[][] b = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        b[i][j] = scanner.nextInt();
      }
    }

    int[][] c = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        c[i][j] = scanner.nextInt();
      }
    }

    int[][] d = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        d[i][j] = scanner.nextInt();
      }
    }

    int[][] e = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        e[i][j] = scanner.nextInt();
      }
    }

    int[][] f = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        f[i][j] = scanner.nextInt();
      }
    }

    int[][] g = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        g[i][j] = scanner.nextInt();
      }
    }

    int[][] h = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        h[i][j] = scanner.nextInt();
      }
    }

    int[][] i = new int[N][M];
    for (int j = 0; j < M; j++) {
      for (int k = 0; k < N; k++) {
        i[k][j] = scanner.nextInt();
      }
    }

    int[][] j = new int[N][M];
    for (int j2 = 0; j2 < M; j2++) {
      for (int k = 0; k < N; k++) {
        j[k][j2] = scanner.nextInt();
      }
    }

    int[][] k = new int[N][M];
    for (int j2 = 0; j2 < M; j2++) {
      for (int k2 = 0; k2 < N; k2++) {
        k[k2][j2] = scanner.nextInt();
      }
    }

    int[][] l = new int[N][M];
    for (int j2 = 0; j2 < M; j2++) {
      for (int k2 = 0; k2 < N; k2++) {
        l[k2][j2] = scanner.nextInt();
      }
    }

    int[][] m = new int[N][M];
    for (int j2 = 0; j2 < M; j2++) {
      for (int k2 = 0
