import java.util.*;

public class p02768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;
        int X = (int)Math.pow(2, n) - 1;
        int A = modcomb(n, a, MOD);
        int B = modcomb(n, b, MOD);
        int ans = (X - A - B) % MOD;
        System.out.println(ans);
    }

    public static int modcomb(int n, int a, int mod) {
        int cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= pow(i + 1, mod - 2, mod);
            cnt %= mod;
        }
        return cnt;
    }

    public static int pow(int a, int b, int mod) {
        if (b == 0) return 1;
        long res = pow(a, b / 2, mod);
        res = (res * res) % mod;
        if (b % 2 == 1) res = (res * a) % mod;
        return (int)res;
    }
}