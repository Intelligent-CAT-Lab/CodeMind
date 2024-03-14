import java.io.*;
import java.util.*;

public class p01668 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int MOD = (int)1e9 + 7;
        int L = Math.max(A.length(), B.length());
        int[] pw10 = new int[L+1];
        int r = 1;
        for(int i=1; i<=L; i++) {
            pw10[i] = r = (r * 10) % MOD;
        }
        class RollingHash {
            int mod;
            int[] pw;
            int[] h;
            public RollingHash(String s, int base, int mod) {
                this.mod = mod;
                pw = new int[s.length()+1];
                h = new int[s.length()+1];
                int v = 0;
                for(int i=0; i<s.length(); i++) {
                    h[i+1] = v = (v * base + s.charAt(i)) % mod;
                }
                v = 1;
                for(int i=0; i<s.length(); i++) {
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
        for(int i=0; i<=C.length(); i++) {
            hY[i] = hy.get(0, i);
        }
        int ans = 0;
        int cur = 0;
        for(int i=0; i<B.length(); i++) {
            int v = B.charAt(i) - '0';
            ans = (ans + cur * v * pw10[B.length() - (i+1)] % MOD) % MOD;
            for(int j=i-C.length()+1; j<=i; j++) {
                if(j+C.length() > B.length()) break;
                int l = i-j;
                if(l > 0 && hx.get(j, j+l)!= hY[l]) continue;
                ans = (ans + pw10[B.length() - (j+C.length())]) % MOD;
            }
            if(C.length() + (i+1) <= B.length()) {
                ans = (ans + v * pw10[B.length() - (C.length() + i+1)] * (B.length() - (i+1) - C.length() + 1) % MOD) % MOD;
            }
            if(i-C.length()+1 >= 0 && hx.get(i-C.length()+1, i+1) == hY[C.length()]) {
                cur = (cur + 1) % MOD;
            }
        }
        for(int j=B.length()-C.length()+1; j<=B.length(); j++) {
            if(hx.get(j, j+C.length())!= hY[C.length()]) continue;
            ans = (ans + 1) % MOD;
        }
        if(C.equals("0")) {
            for(int i=1; i<B.length(); i++) {
                ans = (ans - 9 * pw10[B.length() - i - 1] * i % MOD + MOD) % MOD;
            }
            ans = (ans - (B.length() - 1)) % MOD;
        }
        if(A > 0) {
            A--;
            ans = (ans - calc(A, C)) % MOD;
        }
        bw.write(ans + "\n");
        bw.close();
    }
    public static int calc(int A, String C) {
        int MOD = (int)1e9 + 7;
        int L = C.length();
        int[] pw10 = new int[L+1];
        int r = 1;
        for(int i=1; i<=L; i++) {
            pw10[i] = r = (r * 10) % MOD;
        }
        class RollingHash {
            int mod;
            int[] pw;
            int[] h;
            public RollingHash(String s, int base, int mod) {
                this.mod = mod;
                pw = new int[s.length()+1];
                h = new int[s.length()+1];
                int v = 0;
                for(int i=0; i<s.length(); i++) {
                    h[i+1] = v = (v * base + s.charAt(i)) % mod;
                }
                v = 1;
                for(int i=0; i<s.length(); i++) {
                    pw[i+1] = v = (v * base) % mod;
                }
            }
            public int get(int l, int r) {
                return (h[r] - h[l] * pw[r-l]) % mod