import java.util.Scanner;

public class p02768 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        long X = pow(2, n, MOD) - 1;
        long A = modcomb(n, a, MOD);
        long B = modcomb(n, b, MOD);
        long ans = (X - A - B) % MOD;
        System.out.println(ans);
    }

    public static long pow(long base, int exp, int mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static long modcomb(int n, int a, int mod) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= pow(i + 1, mod - 2, mod);
            cnt %= mod;
        }
        return cnt;
    }
}