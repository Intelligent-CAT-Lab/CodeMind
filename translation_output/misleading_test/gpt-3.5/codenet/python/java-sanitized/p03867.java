import java.util.*;

public class p03867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;
        int i = 1;
        int M = N;
        ArrayList<Integer> div = new ArrayList<Integer>();
        
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

        for (int j = 0; j < N1; j++) {
            num[j] = pow(K, (div.get(j) + 1) / 2, MOD);
            for (int k = 0; k < j; k++) {
                if (div.get(j) % div.get(k) == 0) {
                    num[j] = (num[j] - num[k] + MOD) % MOD;
                }
            }

            if (div.get(j) % 2 == 0) {
                ans = (ans + (div.get(j) * num[j] / 2) % MOD) % MOD;
            } else {
                ans = (ans + (div.get(j) * num[j]) % MOD) % MOD;
            }
        }

        System.out.println(ans);
    }

    public static int pow(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }

        return result;
    }
}