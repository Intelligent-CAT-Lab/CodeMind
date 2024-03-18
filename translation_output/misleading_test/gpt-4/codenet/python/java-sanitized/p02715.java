import java.util.Scanner;

public class p02715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        final int P = 1000000007;
        int[] X = new int[K + 1];
        long ans = 0;

        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += (long) X[i] * powMod(K / i, N, P);
        }

        System.out.println(ans % P);
    }

    private static long powMod(int base, int exponent, int modulo) {
        long result = 1;
        long b = base % modulo;

        while (exponent > 0) {
            if (exponent % 2 != 0) {
                result = (result * b) % modulo;
            }
            exponent = exponent >> 1;
            b = (b * b) % modulo;
        }

        return result;
    }
}