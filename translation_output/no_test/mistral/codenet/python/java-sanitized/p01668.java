import java.io.*;
import java.util.*;

public class p01668 {
    private int mod;
    private int[] pw;
    private int[] h;

    public RollingHash(String s, int base, int mod) {
        this.mod = mod;
        this.pw = new int[s.length() + 1];
        this.h = new int[s.length() + 1];

        int l = s.length();
        this.h[l + 1] = 0;
        this.pw[l + 1] = 1;

        int v = 0;
        for (int i = 0; i < l; i++) {
            h[i + 1] = v = (v * base + s.charAt(i)) % mod;
        }
        v = 1;
        for (int i = 0; i < l; i++) {
            pw[i + 1] = v = v * base % mod;
        }
    }

    public int get(int l, int r) {
        return (h[r] - h[l] * pw[r - l]) % mod;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        String C = input[2];

        int L = Math.max(A.length(), B.length());
        int[] pw10 = new int[L + 1];
        int r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % 1000000007;
        }

        RollingHash rh = new RollingHash(A, 37, 1000000007);
        int[] hY = new int[L + 1];
        for (int i = 0; i <= L; i++) {
            hY[i] = rh.get(0, i);
        }

        int res = 0;
        int cur = 0;
        for (int i = 0; i < A.length(); i++) {
            int v = A.charAt(i) - '0';
            res += cur * v * pw10[A.length() - (i + 1)] % 1000000007;
            for (int j = i - B.length() + 1; j <= i + 1; j++) {
                if (j + B.length() > A.length()) {
                    break;
                }
                int l = i - j;
                if (l > 0 && rh.get(j, l) != hY[l]) {
                    continue;
                }
                res += pw10[A.length() - (j + B.length())];
            }
            if (B.length() + (i + 1) <= A.length()) {
                res += v * pw10[A.length() - (B.length() + i + 1)] * (A.length() - (i + 1) - B.length() + 1) % 1000000007;
            }
            if (i - B.length() + 1 >= 0 && rh.get(i - B.length() + 1, i + 1) == hY[B.length()]) {
                cur++;
            }
        }
        for (int j = A.length() - B.length() + 1; j <= A.length(); j++) {
            if (rh.get(j, B.length()) != hY[B.length()]) {
                continue;
            }
            res++;
        }
        if (B.equals("0")) {
            for (int i = 1; i < A.length(); i++) {
                res -= 9 * pw10[A.length() - i - 1] * i % 1000000007;
            }
            res -= A.length() - 1;
        }
        System.out.println(res % 1000000007);
    }
}