import java.util.*;

public class p02768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = (int)Math.pow(10,9)+7;

        long cnt = 1;
        for(int i=0; i<a; i++){
            cnt *= (n-i);
            cnt *= modpow(i+1,MOD-2,MOD);
            cnt %= MOD;
        }

        long X = modpow(2,n,MOD)-1;
        long A = cnt;
        long B = modcomb(n,b,MOD);
        long ans = (X-A-B+MOD*2)%MOD;
        System.out.println(ans);
    }

    public static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            long tmp = n & 1;
            if (tmp == 1) res = res * a % mod;
            a = a * a % mod;
            n = n >> 1;
        }
        return res;
    }

    public static long modcomb(int n, int k, int mod) {
        long res = 1;
        for (int i = n; i > n - k; i--) {
            res = (res * i) % mod;
        }
        for (int i = 1; i <= k; i++) {
            res = (res * modpow(i, mod - 2, mod)) % mod;
        }
        return res;
    }
}