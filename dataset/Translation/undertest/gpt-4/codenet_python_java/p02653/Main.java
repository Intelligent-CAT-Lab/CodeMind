import java.util.*;
import java.math.BigInteger;
 
public class p02653 {
    static final long P = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aa, bb;
        n = sc.nextInt();
        aa = sc.nextInt();
        bb = sc.nextInt();

        int a = Math.max(aa, bb);
        int b = Math.min(aa, bb);

        long[] xs0 = new long[n + 1];
        long[] os0 = new long[n + 1];

        Arrays.fill(xs0, 0);
        Arrays.fill(os0, 0);
        
        os0[0] = 1;

        for (int i = b; i < a; i++) {
            for (int j = b; j <= i; j++) {
                xs0[i] += os0[i - j];
                xs0[i] %= P;
            }
            for (int j = 1; j <= i; j++) {
                os0[i] += xs0[i - j];
                os0[i] %= P;
            }
        }

        long[] os = new long[a];

        for (int i = b; i < a - 2; i++) {
            for (int j = 2; j < a - i; j++) {
                os[i + j] += xs0[i] * (j - 1);
            }
        }

        long[] x = new long[n + 1];
        long[] o = new long[n + 1];

        for (int i = b + 1; i < a; i++) {
            for (int j = b; j < i; j++) {
                o[i] += xs0[j];
                o[i] %= P;
            }
        }

        x[0] = 1;
        o[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < Math.min(b, i + 1); j++) {
                x[i] += o[i - j];
            }
            for (int j = 1; j < Math.min(a, i + 1); j++) {
                o[i] += x[i - j];
            }
            for (int j = b + 2; j < Math.min(a, i + 1); j++) {
                o[i] += x[i - j] * os[j];
            }
            x[i] %= P;
            o[i] %= P;
        }

        for (int i = b + 1; i < a; i++) {
            for (int j = b; j < i; j++) {
                o[n] += xs0[j] * x[n - i];
                o[i] %= P;
            }
        }

        long ans = o[n] + x[n];
        ans %= P;

        long[] beki2 = new long[5001];
        beki2[0] = 1;

        for (int i = 0; i < 5000; i++) {
            beki2[i + 1] = beki2[i] * 2;
            beki2[i + 1] %= P;
        }

        ans = beki2[n] - ans;
        ans += P;
        ans %= P;

        System.out.println(ans);
        sc.close();
    }
}