import java.util.*;

class Tenka1F {
    
    static int modfac(int n, int MOD) {
        int f = 1;
        int[] factorials = new int[n+1];
        factorials[0] = 1;
        for (int m = 1; m <= n; m++) {
            f = (int)((long)f * m % MOD);
            factorials[m] = f;
        }
        int inv = pow(f, MOD - 2, MOD);
        int[] invs = new int[n+1];
        invs[n] = inv;
        for (int m = n; m >= 2; m--) {
            inv = (int)((long)inv * m % MOD);
            invs[m-1] = inv;
        }
        return f;
    }
    
    static int modnCr(int n, int r, int mod, int[] fac, int[] inv) {
        return (int)((long)fac[n] * inv[n-r] % mod * inv[r] % mod);
    }
    
    static int pow(int x, int y, int MOD) {
        int res = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (int)((long)res * x % MOD);
            }
            x = (int)((long)x * x % MOD);
            y /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int mod = 998244353;
        int[] fac = new int[N+11];
        int[] inv = new int[N+11];
        modfac(N+10, mod, fac, inv);
        int ans = 0;

        for (int two = 0; two <= N; two++) {
            for (int one = 0; one <= N; one++) {
                if (one + two > N) break;

                int dist = one + two*2;
                int zero = modnCr(N, one+two, mod, fac, inv);
                int now = 0;

                if (dist < X) {
                    now = (int)((long)modnCr(one+two, one, mod, fac, inv) * zero % mod);
                } else if (dist < 2*X) {
                    if (dist-X % 2 == 0) continue;
                    int dtwo = two - (dist-X+1);
                    if (dtwo >= 0) {
                        now = (int)((long)modnCr(one+dtwo, one, mod, fac, inv) * zero % mod);
                    }
                } else if (X % 2 == 1 && one == 0) {
                    now = zero;
                }
                
                ans = (ans + now) % mod;
            }
        }

        System.out.println(ans);
    }
}