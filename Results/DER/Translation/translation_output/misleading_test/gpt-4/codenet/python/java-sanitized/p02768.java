import java.util.Scanner;

public class p02768 {
    private static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        long X = powMod(2, n, MOD) - 1;
        long A = modComb(n, a, MOD);
        long B = modComb(n, b, MOD);
        long ans = ((X - A - B) % MOD + MOD) % MOD;  // Ensure the result is positive

        System.out.println(ans);
    }

    public static long modComb(int n, int a, int mod) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = cnt * (n - i) % mod;
            cnt = cnt * powMod(i + 1, mod - 2, mod) % mod;
        }
        return cnt;
    }

    public static long powMod(long base, int exp, int mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}