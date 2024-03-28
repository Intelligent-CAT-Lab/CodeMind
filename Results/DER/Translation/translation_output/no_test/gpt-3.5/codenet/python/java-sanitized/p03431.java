import java.util.Scanner;

public class p03431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int p = 998244353;

        long[] f = new long[k + 1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (i + 1) * f[i - 1] % p;
        }

        long totalSum = 0;
        for (int i = 0; i < n - 1; i++) {
            totalSum = (totalSum + f[k - 1] * pow(f[i] * f[k - 1 - i], -1, p)) % p;
        }

        System.out.println(totalSum);
    }

    public static long pow(long base, long exponent, long mod) {
        long result = 1;
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