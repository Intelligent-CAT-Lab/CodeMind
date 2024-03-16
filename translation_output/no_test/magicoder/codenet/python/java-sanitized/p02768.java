import java.util.Scanner;

public class p02768 {
    static final long MOD = 1000000007;

    static long modComb(int n, int a) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = (cnt * (n - i)) % MOD;
            cnt = (cnt * pow(i + 1, MOD - 2)) % MOD;
        }
        return cnt;
    }

    static long pow(long x, long y) {
        long res = 1;
        x = x % MOD;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % MOD;
            y = y >> 1;
            x = (x * x) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        long X = pow(2, n) - 1;
        long A = modComb(n, a);
        long B = modComb(n, b);
        long ans = (X - A - B + MOD) % MOD;
        System.out.println(ans);
    }
}