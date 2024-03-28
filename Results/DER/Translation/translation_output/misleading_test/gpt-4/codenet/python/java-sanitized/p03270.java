import java.io.*;
import java.util.*;

public class p03270 {

    static final int MOD = 998244353;
    static final int U = 10000;
    static int[] fact = new int[U + 1];
    static int[] fact_inv = new int[U + 1];

    static {
        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 1);
        for (int n = 1; n <= U; n++) {
            fact[n] = (int) ((long) fact[n - 1] * n % MOD);
        }
        fact_inv[U] = pow(fact[U], MOD - 2);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = (int) ((long) fact_inv[n] * n % MOD);
        }
    }

    static int pow(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (int) ((long) result * base % MOD);
            }
            base = (int) ((long) base * base % MOD);
            exponent >>= 1;
        }
        return result;
    }

    static int comb(int n, int k) {
        if (!(0 <= k && k <= n)) {
            return 0;
        }
        return (int) ((long) fact[n] * fact_inv[k] % MOD * fact_inv[n - k] % MOD);
    }

    static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (int) ((long) comb(x, i) * pow(2, i) % MOD * comb(N + y - 1, i + y - 1) % MOD);
            sum %= MOD;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = input.readLine().split(" ");
        int K = Integer.parseInt(parts[0]);
        int N = Integer.parseInt(parts[1]);

        ArrayList<Integer> answer = new ArrayList<>();
        for (int S = 3; S < K + 3; S += 2) {
            int x = F((S - 1) / 2, K - S + 1, N);
            answer.add(x);
            answer.add(x);
        }

        if ((K & 1) == 1) {
            answer.remove(answer.size() - 1);
            for (int i = answer.size() - 2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        } else {
            for (int i = answer.size() - 2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        }

        for (int ans : answer) {
            System.out.println(ans);
        }
    }
}