import java.util.*;
import java.io.*;
public class p02169 {
    static int mod = 998244353;
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
        long ans = 1;
        for(int i = 0; i < k; i++) {
            ans *= m;
            ans %= mod;
        }
        long c = m;
        long[][] comb = new long[k+1][k+1];
        comb[0][0] = 1;
        for(int i = 0; i < k; i++) {
            for(int j = 0; j <= i; j++) {
                comb[i+1][j] += comb[i][j];
                comb[i+1][j+1] += comb[i][j];
            }
        }
        for(int i = 1; i < k; i++) {
            long k1 = 0;
            for(int j = 1; j <= i; j++) {
                if((i+j)&1) {
                    k1 -= comb[i][j]*pow(j,n,mod);
                } else {
                    k1 += comb[i][j]*pow(j,n,mod);
                }
            }
            k1 *= c;
            k1 %= mod;
            c *= (m-i);
            c *= pow(i+1,mod-2,mod);
            c %= mod;
            ans -= k1;
            ans %= mod;
        }
        System.out.println(ans);
    }
}