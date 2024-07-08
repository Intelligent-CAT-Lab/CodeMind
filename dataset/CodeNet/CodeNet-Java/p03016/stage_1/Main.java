import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long L = scanner.nextLong();
    long A = scanner.nextLong();
    long B = scanner.nextLong();
    long M = scanner.nextLong();

    long[][] m = new long[3][3];
    for (int i = 0; i < 2; i++) m[1][i] = 1;
    for (int i = 1; i < 3; i++) m[2][i] = 1;

    long[] res = new long[] {0, A % M, B % M};
    long k = 10;
    long l = 0;
    while (A > k) k *= 10;
    while (l < L) {
      m[0][0] = k % M;
      long r = Math.min((k - A - 1) / B, L - 1);
      res = mult(res, modpow(m, r - l + 1, M), M);
      l = r + 1;
      k *= 10;
    }

    System.out.println(res[0]);
  }

  private static long[][] modpow(long[][] m, long c, long M) {
    if (c == 0) return new long[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    if (c == 1) return m;
    if (c % 2 == 0) {
      long[][] m1 = modpow(m, c / 2, M);
      return mult(m1, m1, M);
    } else {
      long[][] m1 = modpow(m, c - 1, M);
      return mult(m1, m, M);
    }
  }

  private static long[] mult(long[] a, long[][] b, long M) {
    long[] r = new long[3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        r[i] += a[j] * b[j][i] % M;
        if (r[i] >= M) r[i] -= M;
      }
    }
    return r;
  }

  private static long[][] mult(long[][] a, long[][] b, long M) {
    long[][] r = new long[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          r[i][j] += a[i][k] * b[k][j] % M;
          if (r[i][j] >= M) r[i][j] -= M;
        }
      }
    }
    return r;
  }
}
