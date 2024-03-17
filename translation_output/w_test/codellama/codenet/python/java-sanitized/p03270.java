import java.util.Scanner;

public class p03270 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int MOD = 998244353;
        int U = 10000;
        int[] fact = new int[U + 1];
        int[] fact_inv = new int[U + 1];
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
            fact_inv[n] = pow(fact[n], MOD - 2, MOD);
        }
        for (int n = U; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        int[] answer = new int[K + 1];
        for (int S = 3; S <= K + 2; S += 2) {
            int x = F((S - 1) / 2, K - S + 1, N);
            answer[S - 1] = x;
            answer[S] = x;
        }

        if (K % 2 == 1) {
            answer = answer.subList(0, answer.size() - 1).toArray();
            answer = answer.subList(0, answer.size() - 1).toArray();
        } else {
            answer = answer.subList(0, answer.size() - 1).toArray();
            answer = answer.subList(0, answer.size() - 1).toArray();
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += comb(x, i) * pow(2, i, MOD) * comb(N + y - 1, i + y - 1) % MOD;
        }
        return sum % MOD;
    }

    public static int comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] * fact_inv[n - k] % MOD;
    }

    public static int pow(int x, int y, int MOD) {
        int result = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            y /= 2;
            x = (x * x) % MOD;
        }
        return result;
    }
}