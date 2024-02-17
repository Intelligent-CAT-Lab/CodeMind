public class Main {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int p = 998244353;
        var f = new long[k];
        f[0] = 1;
        for (int i = 1; i < k; i++) f[i] = (f[i - 1] * i) % p;
        var fi = new long[k];
        fi[k - 1] = inv(f[k - 1], p);
        for (int i = k - 1; i > 0; i--) fi[i - 1] = (fi[i] * i) % p;
        long ans = 1;
        for (int i = 1; i < k; i++) if ((ans <<= 1) >= p) ans -= p;
        for (int i = 0; i < Math.min(n - 1, k); i++) {
            ans -= (((f[k - 1] * fi[i]) % p) * fi[k - 1 - i]) % p;
        }
        System.out.println((ans %= p) < 0 ? ans + p : ans);
    }

    public static long inv(long a, long p) {
        long b = p;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp;
            tmp = a; a = b; b = tmp;
            u -= t * v;
            tmp = u; u = v; v = tmp;
        }
        u %= p;
        return u < 0 ? u + p : u;
    }
}