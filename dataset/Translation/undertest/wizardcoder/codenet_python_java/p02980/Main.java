import java.util.*;
import java.io.*;

public class p02980 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int mod = 998244353;

    if (N > M) {
      int temp = N;
      N = M;
      M = temp;
    }

    int[] fact = new int[M + 1];
    int[] powm = new int[M + 1];
    int[] pown = new int[M + 1];
    fact[0] = 1;
    powm[0] = 1;
    pown[0] = 1;
    for (int i = 1; i <= M; i++) {
      fact[i] = (fact[i - 1] * i) % mod;
      powm[i] = (powm[i - 1] * (M + 1)) % mod;
      pown[i] = (pown[i - 1] * (N + 1)) % mod;
    }

    int[][] inv = new int[M + 1][M + 1];
    for (int i = 0; i <= M; i++) {
      inv[i][i] = pow(fact[i], mod - 2);
      for (int j = i + 1; j <= M; j++) {
        inv[i][j] = (inv[i][j - 1] * (j - i)) % mod;
      }
    }

    int ans = 0;
    for (int i = 0; i <= N; i++) {
      int temp = 1;
      for (int j = 0; j <= i; j++) {
        temp = (temp * (N - j) % mod * inv[j][i] % mod) % mod;
      }
      ans = (ans + temp * powm[N - i] % mod * pown[M - i] % mod) % mod;
    }

    System.out.println(ans);
  }

  public static int pow(int n, int m) {
    if (m == 0) {
      return 1;
    }
    int res = 1;
    while (m > 0) {
      if (m % 2 == 1) {
        res = (res * n) % 998244353;
      }
      n = (n * n) % 998244353;
      m /= 2;
    }
    return res;
  }
}