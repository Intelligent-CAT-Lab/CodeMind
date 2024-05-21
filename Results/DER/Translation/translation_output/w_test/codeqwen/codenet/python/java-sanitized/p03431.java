import java.util.Scanner;

public class p03431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = 998244353;
        int[] f = new int[k + 1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (int) ((i * (long) f[i - 1]) % p);
            f[i] = (int) ((p - p / f[i]) * (long) f[i] % p);
        }
        long sum = 0;
        for (int i = n - 1; i <= k; i++) {
            sum = (sum + (long) f[i] * pow(f[i - n + 1], -1, p)) % p;
        }
        System.out.println(sum);
    }

    public static int pow(int a, int b, int p) {
        int res = 1;
        a = a % p;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % p;
            b = b >> 1;
            a = (a * a) % p;
        }
        return res;
    }
}