import java.util.Scanner;

public class p03431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = 998244353;

        long[] f = new long[k+1];
        f[0] = 1;
        for (int i = 0; i < k; i++) {
            f[i+1] = (i+1) * f[i] % p;
        }

        long result = 0;
        for (int i = 0; i < n-1; i++) {
            result += f[k-1] * pow(f[i] * f[k-1-i], p-2, p);
        }
        result %= p;

        System.out.println(result);
    }

    public static long pow(long x, int y, int p) {
        long res = 1;
        x = x % p;

        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % p;
            }

            y = y >> 1;
            x = (x * x) % p;
        }

        return res;
    }
}