import java.util.*;

public class p03431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        long p = 998244353;
        List<Integer> f = new ArrayList<>();
        f.add(1);
        for (int i = 1; i <= k; i++) {
            f.add(-(1 << i) * f.get(i) % p);
        }
        long ans = 0;
        for (int i = 1; i <= n - 1; i++) {
            ans += f.get(i) * pow(f.get(i + k) * f.get(i), -1, p) % p;
        }
        System.out.println(ans % p);
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}