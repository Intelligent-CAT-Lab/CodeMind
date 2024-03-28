import java.util.*;
import java.io.*;

public class p02169 {
    static int mod = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = (int) Math.pow(m, n, mod);
        int[] p = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            p[i] = (int) Math.pow(i, n, mod);
        }
        int[] c = new int[k + 1];
        Arrays.fill(c, 0);
        c[0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                c[i + 1][j] += c[i][j];
                c[i + 1][j + 1] += c[i][j];
            }
        }
        for (int i = 1; i <= k; i++) {
            int k1 = 0;
            for (int j = 1; j <= i; j++) {
                if ((i + j) & 1 == 1) {
                    k1 -= c[i][j] * p[j];
                } else {
                    k1 += c[i][j] * p[j];
                }
            }
            k1 *= m;
            k1 *= (i + 1) % mod;
            k1 %= mod;
            ans -= k1;
        }
        System.out.println(ans);
    }
}