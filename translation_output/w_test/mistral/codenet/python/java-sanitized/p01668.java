import java.util.*;

public class p01668 {
    private int mod;
    private int[] pw;
    private int[] h;

    public RollingHash(String s, int base, int mod) {
        this.mod = mod;
        this.pw = new int[s.length() + 1];
        this.h = new int[s.length() + 1];

        int v = 0;
        for (int i = 0; i < s.length(); i++) {
            h[i + 1] = v = (v * base + s.charAt(i)) % mod;
        }
        v = 1;
        for (int i = 0; i < s.length(); i++) {
            pw[i + 1] = v = v * base % mod;
        }
    }

    public int get(int l, int r) {
        return (h[r] - h[l] * pw[r - l]) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        int L = Math.max(A.length(), Math.max(B.length(), C.length()));
        int[] pw10 = new int[L + 1];
        int r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % (int) 1e9 + 7;
        }

        RollingHash rh = new RollingHash(A, 37, (int) 1e9 + 7);
        RollingHash rh2 = new RollingHash(B, 37, (int) 1e9 + 7);
        RollingHash rh3 = new RollingHash(C, 37, (int) 1e9 + 7);

        int ans = 0;
        for (int i = 0; i < L; i++) {
            int v = Integer.parseInt(A.substring(i, i + 1));
            ans += (rh.get(i, i + 1) - rh2.get(i, i + 1) * pw10[i + 1]) % (int) 1e9 + 7;
        }

        for (int i = 0; i < L - B.length() + 1; i++) {
            if (rh2.get(i, i + B.length()) != rh3.get(i, i + B.length())) {
                continue;
            }
            ans++;
        }

        if (B.equals("0")) {
            for (int i = 1; i < L - C.length() + 1; i++) {
                ans -= (pw10[L - i - 1] * i) % (int) 1e9 + 7;
            }
            ans -= L - 1;
        }

        ans %= (int) 1e9 + 7;
        System.out.println(ans);
    }
}