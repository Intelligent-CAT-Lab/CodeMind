import java.util.*;

public class p03270 {
    final static int MOD = 998244353;
    final static int U = 10000;
    static int[] fact = new int[U + 1];
    static int[] fact_inv = new int[U + 1];

    static {
        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 1);
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
            fact_inv[n] = pow(fact[n], MOD - 2, MOD);
        }
        for (int n = U; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }
    }

    static int comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] * fact_inv[n - k] % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K, N;
        K = sc.nextInt();
        N = sc.nextInt();

        List<Integer> answer = new ArrayList<>();
        for (int S = 3; S <= K + 1; S += 2) {
            int x = F((S - 1) / 2, K - S + 1, N);
            answer.add(x);
            answer.add(x);
        }

        if ((K & 1) == 1) {
            answer = answer.subList(0, answer.size() - 1);
            answer.addAll(answer.subList(answer.size() - 1, 0, 2));
        } else {
            answer.addAll(answer.subList(answer.size() - 1, 0, 2));
        }

        System.out.println(answer);
    }

    static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        return (int) Math.pow(2, n, MOD) * sum(comb(x, i) * comb(N + y - 1, i + y - 1) % MOD for i in range(1, n + 1)) % MOD;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}