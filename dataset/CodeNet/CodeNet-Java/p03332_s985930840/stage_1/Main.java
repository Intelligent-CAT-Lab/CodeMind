import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static long MOD = 998244353;

  public static void main(String[] args) {
    int N = sc.nextInt();
    long A = sc.nextInt();
    long B = sc.nextInt();
    long K = sc.nextLong();
    long[] fact = new long[N + 1];
    long[] factInv = new long[N + 1];
    fact[0] = 1;
    for (int i = 1; i <= N; i++) {
      fact[i] = fact[i - 1] * i % MOD;
    }
    for (int i = 0; i <= N; i++) {
      factInv[i] = inv(fact[i]);
    }
    long[] comb = new long[N + 1];
    for (int i = 0; i <= N; i++) {
      comb[i] = fact[N] * factInv[i] % MOD * factInv[N - i] % MOD;
    }
    long ans = 0;
    for (int i = 0; i <= N; i++) {
      long b = K - A * i;
      if (b % B != 0) continue;
      b /= B;
      if (b < 0 || b > N) continue;
      ans += comb[i] * comb[(int)b] % MOD;
    }
    System.out.println(ans % MOD);
  }

  static long inv(long v) {
    return pow(v, MOD - 2);
  }

  static long pow(long b, long p) {
    if (p == 0) return 1;
    if (p == 1) return b;
    long ret = pow(b, p / 2);
    ret = ret * ret % MOD;
    if (p % 2 == 1) {
      ret = ret * b % MOD;
    }
    return ret;
  }

}
