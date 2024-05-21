import java.util.*;
public class p03431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 998244353;
        long[] f = new long[k+1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (-~i * f[i-1]) % p;
        }
        long ans = 0;
        for (int i = n-1; i < k; i++) {
            ans = (ans + f[i] * pow(f[i-n+2] * f[k-i] % p, p-2, p)) % p;
        }
        System.out.println(ans);
    }
    public static long pow(long a, long b, long p) {
        long res = 1;
        a %= p;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % p;
            }
            a = (a * a) % p;
            b >>= 1;
        }
        return res;
    }
}