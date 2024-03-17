import java.io.*;
import java.util.*;

public class p01668 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        int ans = solve(nums);
        bw.write(ans + "\n");
        bw.close();
    }

    public static int solve(int[] nums) {
        int MOD = 1000000007;
        int A = nums[0];
        int B = nums[1];
        int C = nums[2];
        int L = Math.max(B.length(), C.length());
        int[] pw10 = new int[L+1];
        pw10[0] = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = (pw10[i-1] * 10) % MOD;
        }
        class RollingHash {
            int mod;
            int[] pw;
            int[] h;
            public RollingHash(String s, int base, int mod) {
                this.mod = mod;
                this.pw = new int[s.length()+1];
                this.h = new int[s.length()+1];
                int v = 0;
                for (int i = 0; i < s.length(); i++) {
                    h[i+1] = v = (v * base + s.charAt(i)) % mod;
                }
                v = 1;
                for (int i = 0; i < s.length(); i++) {
                    pw[i+1] = v = (v * base) % mod;
                }
            }
            public int get(int l, int r) {
                return (h[r] - h[l] * pw[r-l]) % mod;
            }
        }
        RollingHash hx = new RollingHash(B, 37, MOD);
        RollingHash hy = new RollingHash(C, 37, MOD);
        int[] hY = new int[C.length()+1];
        for (int i = 0; i <= C.length(); i++) {
            hY[i] = hy.get(0, i);
        }
        int res = 0;
        int cur = 0;
        for (int i = 0; i < B.length(); i++) {
            int v = B.charAt(i) - '0';
            res = (res + cur * v * pw10[B.length() - (i+1)]) % MOD;
            for (int j = i-C.length()+1; j <= i; j++) {
                if (j+C.length() > B.length()) {
                    break;
                }
                int l = i-j;
                if (l > 0 && hx.get(j, j+l)!= hY[l]) {
                    continue;
                }
                res = (res + pw10[B.length() - (j+C.length())]) % MOD;
            }
            if (C.length() + (i+1) <= B.length()) {
                res = (res + v * pw10[B.length() - (C.length() + i+1)] * (B.length() - (i+1) - C.length() + 1)) % MOD;
            }
            if (i-C.length()+1 >= 0 && hx.get(i-C.length()+1, i+1) == hY[C.length()]) {
                cur = (cur + 1) % MOD;
            }
        }
        for (int j = 0; j < B.length()-C.length()+1; j++) {
            if (hx.get(j, j+C.length())!= hY[C.length()]) {
                continue;
            }
            res = (res + 1) % MOD;
        }
        if (C.equals("0")) {
            for (int i = 1; i < B.length(); i++) {
                res = (res - 9 * pw10[B.length() - i - 1] * i) % MOD;
            }
            res = (res - (B.length() - 1)) % MOD;
        }
        return res;
    }
}