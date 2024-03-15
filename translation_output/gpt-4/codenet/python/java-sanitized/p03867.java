import java.util.*;

public class p03867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        final int MOD = 1000000007;
        int i = 1;
        ArrayList<Integer> div = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i != i) {
                    div.add(N / i);
                }
            }
            i++;
        }

        Collections.sort(div);
        int N1 = div.size();
        int[] num = new int[N1 + 1];
        int ans = 0;
        for (i = 0; i < N1; i++) {
            num[i] = pow(K, (div.get(i) + 1) / 2, MOD);
            for (int j = 0; j < i; j++) {
                if (div.get(i) % div.get(j) == 0) {
                    num[i] = (num[i] - num[j] + MOD) % MOD;
                }
            }

            if (div.get(i) % 2 == 0) {
                ans += (long) div.get(i) * num[i] / 2 % MOD;
                ans %= MOD;
            } else {
                ans += (long) div.get(i) * num[i] % MOD;
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }

    // Method to calculate (base^exponent) % modulo using binary exponentiation
    private static int pow(int base, int exponent, int modulo) {
        int result = 1;

        base %= modulo;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * (long) base) % modulo;
            }
            base = (base * (long) base) % modulo;
            exponent /= 2;
        }

        return result;
    }
}