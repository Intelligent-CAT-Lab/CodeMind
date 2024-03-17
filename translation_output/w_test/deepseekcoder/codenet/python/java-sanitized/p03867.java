import java.util.*;

public class p03867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        final long MOD = (long) Math.pow(10, 9) + 7;

        List<Integer> div = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                div.add(i);
                if (N / i != i) {
                    div.add(N / i);
                }
            }
        }

        Collections.sort(div);
        int N1 = div.size();
        long[] num = new long[N1 + 1];
        long ans = 0;
        for (int i = 0; i < N1; i++) {
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

    private static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b = b / 2;
        }
        return result;
    }
}