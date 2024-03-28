import java.util.Scanner;

public class p02768 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;

        long X = power(2, n, MOD) - 1;
        long A = modComb(n, a, MOD);
        long B = modComb(n, b, MOD);
        long ans = (X - A - B) % MOD;
        System.out.println(ans);
    }

    public static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public static long modComb(int n, int r, long p) {
        long num = 1;
        for (int i = 0; i < r; i++) {
            num = (num * (n - i)) % p;
            num = (num * power(i + 1, p - 2, p)) % p;
        }
        return num;
    }
}