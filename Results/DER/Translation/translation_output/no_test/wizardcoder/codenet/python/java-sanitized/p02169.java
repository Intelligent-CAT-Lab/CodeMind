import java.util.*;
import java.io.*;

public class p02169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n < k) {
            System.out.println(0);
            return;
        }
        if(m < k) {
            System.out.println(0);
            return;
        }
        int mod = 998244353;
        long ans = 1;
        for(int i = 1; i <= k; i++) {
            ans = (ans * i) % mod;
        }
        long c = m;
        for(int i = 1; i <= k; i++) {
            long k1 = 0;
            for(int j = 1; j <= i; j++) {
                k1 = (k1 + (long)comb(i,j)*pow(j,n,mod)) % mod;
            }
            k1 = (k1 * c) % mod;
            c = (c * (m-i) * pow(i+1,mod-2,mod)) % mod;
            ans = (ans - k1) % mod;
        }
        System.out.println(ans);
    }
    public static int comb(int n, int r) {
        int res = 1;
        if(r > n-r) r = n-r;
        for(int i = 0; i < r; i++) {
            res = (res * (n-i)) / (i+1);
        }
        return res;
    }
    public static long pow(long a, long b, long mod) {
        long res = 1;
        while(b > 0) {
            if((b & 1) == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}