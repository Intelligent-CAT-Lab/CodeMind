import java.util.*;

public class p03867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;
        int i = 1;
        int M = N;
        List<Integer> div = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i != i) {
                    div.add(N / i);
                }
            }
            i += 1;
        }

        Collections.sort(div);
        int N1 = div.size();
        long[] num = new long[N1 + 1];
        long ans = 0;
        for (i = 0; i < N1; i++) {
            num[i] = pow(K, (div.get(i) + 1) / 2, MOD);
            for (int j = 0; j < i; j++) {
                if (div.get(i) % div.get(j) == 0) {
                    num[i] = num[i] - num[j] + MOD;
                    num[i] %= MOD;
                }
            }

            if (div.get(i) % 2 == 0) {
                ans += div.get(i) * num[i] / 2;
                ans %= MOD;
            } else {
                ans += div.get(i) * num[i];
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }

    private static long pow(int base, int exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}