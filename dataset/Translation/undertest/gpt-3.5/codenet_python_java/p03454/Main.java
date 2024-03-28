import java.util.Scanner;

public class p03454 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        final int MOD = 1000000007;
        int ans = 0;

        int r = 1;
        int tot = 1;
        for (int l = 1; l < 10000000; l++) {
            while (tot < S) {
                r++;
                tot += Integer.toString(r).length();
            }
            if (tot == S) {
                ans++;
            }
            tot -= Integer.toString(l).length();
        }

        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) {
                break;
            }
            if (m != 0) {
                ans++;
            } else {
                ans += (pow(10, d, MOD) - pow(10, d - 1, MOD) - cnt + 1);
            }
            ans %= MOD;
        }

        System.out.println(ans % MOD);
    }

    private static int pow(int base, int exponent, int mod) {
        int result = 1;
        base = base % mod;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}