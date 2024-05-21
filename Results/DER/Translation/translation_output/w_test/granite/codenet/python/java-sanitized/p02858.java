import java.util.*;

public class p02858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        long gh = gcd(H, T);
        long gw = gcd(W, T);
        long h = H / gh;
        long w = W / gw;
        long MOD = 1000000007;
        long ans = pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD);
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return ans;
    }
}