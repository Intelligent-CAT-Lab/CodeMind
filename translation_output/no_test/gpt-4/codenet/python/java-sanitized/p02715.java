import java.util.Scanner;

public class p02715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        final int P = 1000000007;
        long[] X = new long[K + 1];
        long ans = 0;

        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans = (ans + X[i] * pow(K / i, N, P)) % P;
        }
        System.out.println(ans);
    }

    private static long pow(int a, int b, int P) {
        long result = 1;
        long base = a;

        while (b > 0) {
            if (b % 2 == 1) result = (result * base) % P;
            base = (base * base) % P;
            b /= 2;
        }

        return result;
    }
}