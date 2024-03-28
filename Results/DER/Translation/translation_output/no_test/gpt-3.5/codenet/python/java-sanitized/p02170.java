import java.util.*;
import java.io.*;

public class p02170 {

    static long mod = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
    }

    static void solve(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        long[] lst = new long[k+1];
        lst[k-1] = 1;
        long A = (long)a * pow(100*n, mod-2, mod) % mod;
        long inv = pow(n, mod-2, mod);

        for (int i = k-2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (long)A * (lst[i+1] - lst[i+n+1]) + lst[i+1];
                lst[i] %= mod;
            } else {
                lst[i] = (long)A * (lst[i+1] - lst[k]) + (n-(k-i)+1) * inv + lst[i+1];
                lst[i] %= mod;
            }
        }

        long result = (lst[0] - lst[1] + mod) % mod;
        System.out.println(result);
    }

    static long pow(long base, long exp, long m) {
        if (exp == 0) return 1;
        long half = pow(base, exp/2, m) % m;
        if (exp % 2 == 0) {
            return (half * half) % m;
        } else {
            return (base * half * half) % m;
        }
    }
}