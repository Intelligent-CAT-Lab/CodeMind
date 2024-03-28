import java.util.Scanner;

public class p02715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long P = (long) Math.pow(10, 9) + 7;
        long[] X = new long[K + 1];
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * pow(K / i, N, P);
        }
        System.out.println(ans % P);
    }

    private static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }
}