import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p03867 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int i = 1;
        int M = N;
        ArrayList<Integer> div = new ArrayList<>();

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
            num[i] = modPower(K, (div.get(i) + 1) / 2, MOD);
            for (int j = 0; j < i; j++) {
                if (div.get(i) % div.get(j) == 0) {
                    num[i] = (num[i] - num[j] + MOD) % MOD;
                }
            }

            if (div.get(i) % 2 == 0) {
                ans += (long) div.get(i) * num[i] / 2;
                ans %= MOD;
            } else {
                ans += (long) div.get(i) * num[i];
                ans %= MOD;
            }
        }

        System.out.println(ans);
        scanner.close();
    }

    private static long modPower(int base, int exp, int mod) {
        long result = 1;
        long b = base % mod;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * b) % mod;
            }
            exp /= 2;
            b = (b * b) % mod;
        }

        return result;
    }
}