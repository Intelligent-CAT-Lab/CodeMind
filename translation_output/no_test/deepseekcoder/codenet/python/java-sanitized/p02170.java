import java.util.*;
import java.io.*;

public class p02170 {
    static int mod = (int)998244353;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static void solve() throws IOException {
        int n = nextInt(), k = nextInt(), a = nextInt();
        long[] lst = new long[k+1];
        lst[k-1] = 1;
        long A = a * power(100*n, mod-2, mod);
        long inv = power(n, mod-2, mod);

        for (int i = k-2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (A * (lst[i+1] - lst[i+n+1]) + lst[i+1]) % mod;
            } else {
                lst[i] = (A * (lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1]) % mod;
            }
        }
        System.out.println((lst[0] - lst[1] + mod) % mod);
    }

    static long power(long a, long b, long m) {
        long t;
        if(b==0) return 1;
        t = power(a,b/2,m);
        if(b%2==0) return (t*t)%m;
        else return ((t*t)%m*a)%m;
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}