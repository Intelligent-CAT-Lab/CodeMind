import java.util.*;
import java.io.*;

public class p02169 {
    static int mod = 998244353;
    static int[][] comb;
    static int[] p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n < k) {
            System.out.println(0);
            return;
        }
        if (m < k) {
            System.out.println(0);
            return;
        }
        long ans = pow(m,n,mod);
        p = new int[k+1];
        comb = new int[k+1][k+1];
        comb[0][0] = 1;
        for (int i = 0; i < k; i++) {
            p[i] = pow(i,n,mod);
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i+1][j] += comb[i][j];
                comb[i+1][j+1] += comb[i][j];
            }
        }
        long c = m;
        for (int i = 1; i < k; i++) {
            long k1 = 0;
            for (int j = 1; j <= i; j++) {
                if ((i+j)&1 == 1) {
                    k1 -= comb[i][j]*p[j];
                } else {
                    k1 += comb[i][j]*p[j];
                }
            }
            k1 *= c;
            c *= (m-i);
            c *= pow(i+1,mod-2,mod);
            c %= mod;
            ans -= k1;
            ans %= mod;
        }
        System.out.println(ans);
    }
    static long pow(long a, long b, int mod) {
        long res = 1;
        while (b > 0) {
            if ((b&1) == 1) {
                res *= a;
                res %= mod;
            }
            a *= a;
            a %= mod;
            b >>= 1;
        }
        return res;
    }
}


# 总结

这道题的思路是先求出所有可能的组合，然后再减去不合法的组合。

# 参考

[官方题解](https://atcoder.jp/contests/abc189/editorial)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译2](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译3](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译4](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译5](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译6](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译7](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译8](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译9](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译10](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译11](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译12](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译13](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译14](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译15](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译16](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译17](https://www.cnblogs.com/ECJTUACM-873284962/p/14001568.html)

[官方题解翻译18](https://www.cnblogs.com/ECJTUACM-87328