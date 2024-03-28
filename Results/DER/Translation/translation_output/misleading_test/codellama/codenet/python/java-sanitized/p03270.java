import java.util.Scanner;

public class p03270 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int[] fact = new int[10001];
        int[] fact_inv = new int[10001];
        for (int n = 1; n <= 10000; n++) {
            fact[n] = fact[n - 1] * n % 998244353;
            fact_inv[n] = pow(fact[n], 998244353 - 2, 998244353);
        }
        for (int n = 10000; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % 998244353;
        }

        int[] answer = new int[K + 1];
        for (int S = 3; S <= K + 2; S += 2) {
            int x = F((S - 1) / 2, K - S + 1, N);
            answer[S - 3] = x;
            answer[S - 2] = x;
        }

        if (K % 2 == 0) {
            answer = answer.clone();
            answer = answer.clone();
        } else {
            answer = answer.clone();
            answer = answer.clone();
            for (int i = 0; i < answer.length / 2; i++) {
                int temp = answer[i];
                answer[i] = answer[answer.length - i - 1];
                answer[answer.length - i - 1] = temp;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += comb(x, i) * pow(2, i, 998244353) * comb(N + y - 1, i + y - 1) % 998244353;
        }
        return sum % 998244353;
    }

    public static int comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] * fact_inv[n - k] % 998244353;
    }

    public static int pow(int a, int b, int mod) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
}