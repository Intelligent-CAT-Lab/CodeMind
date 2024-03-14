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

    int[][] inv_fact = new int[M + 1][mod];
    inv_fact[M][mod - 2] = 1;
    for (int i = M - 1; i >= 0; i--) {
      for (int j = 0; j < mod; j++) {
        inv_fact[i][j] = (inv_fact[i + 1][j] * (i + 1)) % mod;
      }
    }

    int ans = 0;
    for (int i = 0; i <= N; i++) {
      int temp = 1;
      for (int j = 0; j < i; j++) {
        temp = (temp * (N - j) * (M - j)) % mod;
      }
      ans = (ans + temp * pow(fact[i] * powm[N - i] * pown[M - i], mod - 2)) % mod;
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
        res = (res * n) % mod;
      }
      n = (n * n) % mod;
      m /= 2;
    }
    return res;
  }
}