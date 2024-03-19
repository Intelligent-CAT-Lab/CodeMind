import java.util.Scanner;

public class p03431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long p = 998244353;
        long[] f = new long[k+1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = -~i * f[i-1] % p;
        }
        long sum = 0;
        for (int i = n-1; i >= k; i--) {
            sum += f[k-1] * pow(f[i] * f[k-i-1], p-2, p) % p;
        }
        System.out.println(sum % p);
    }

    public static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a % m;
            }
            a = a * a % m;
            b >>= 1;
        }
        return result;
    }
}