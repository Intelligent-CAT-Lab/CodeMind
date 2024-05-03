import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;
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
        int[] num = new int[N1 + 1];
        int ans = 0;
        for (int j = 0; j < N1; j++) {
            num[j] = (int) Math.pow(K, (div.get(j) + 1) / 2);
            num[j] %= MOD;
            for (int k = 0; k < j; k++) {
                if (div.get(j) % div.get(k) == 0) {
                    num[j] = (num[j] - num[k] + MOD) % MOD;
                }
            }

            if (div.get(j) % 2 == 0) {
                ans += div.get(j) * num[j] / 2;
                ans %= MOD;
            } else {
                ans += div.get(j) * num[j];
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }
}