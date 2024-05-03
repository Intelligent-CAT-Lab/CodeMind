import java.util.*;
import java.io.*;

class RollingHash {
    int mod;
    int[] pw;
    int[] h;

    RollingHash(String s, int base, int mod) {
        this.mod = mod;
        int l = s.length();
        pw = new int[l + 1];
        h = new int[l + 1];

        int v = 0;
        for (int i = 0; i < l; i++) {
            h[i + 1] = v = (v * base + s.charAt(i)) % mod;
        }
        v = 1;
        for (int i = 0; i < l; i++) {
            pw[i + 1] = v = v * base % mod;
        }
    }

    int get(int l, int r) {
        return (h[r] - h[l] * pw[r - l]) % mod;
    }
}

public class p01668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        solve(br, pw);
        pw.close();
    }

    static void solve(BufferedReader br, PrintWriter pw) throws IOException {
        int MOD = 1000000007;
        String[] s = br.readLine().trim().split(" ");
        String A = s[0];
        String B = s[1];
        String C = s[2];
        int L = Math.max(A.length(), B.length());
        int[] pw10 = new int[L + 1];
        int r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % MOD;
        }

        RollingHash hx = new RollingHash(A, 37, MOD);
        Rolling