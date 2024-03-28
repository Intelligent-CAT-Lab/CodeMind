import java.util.*;

public class p02768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        long MOD = 1000000007;

        long ans = (pow(2, n, MOD) - modcomb(n, a, MOD) - modcomb(n, b, MOD)) % MOD;
        System.out.println(ans);
    }

    public static long modcomb(int n, int a, long mod) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= pow(i + 1, mod - 2, mod);
            cnt %= mod;
        }
        return cnt;
    }

    public static long pow(long base, long exp, long mod) {
        long ans = 1;
        while (exp != 0) {
            if (exp % 2 == 1) {
                ans *= base % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return ans;
    }
}