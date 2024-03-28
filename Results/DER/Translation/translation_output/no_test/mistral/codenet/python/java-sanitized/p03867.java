import java.util.*;

public class p03867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long MOD = 1000000007;
        int i = 1;
        long M = N;
        List<Integer> div = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i != i) {
                    div.add(N / i);
                }
            }
            i++;
        }

        div.sort(Collections.reverseOrder());
        int N1 = div.size();
        int[] num = new int[N1 + 1];
        long ans = 0;
        for (int j = 0; j < N1; j++) {
            num[j] = (int) Math.pow(K, (div.get(j) + 1) / 2, MOD);
            for (int k = 0; k < j; k++) {
                if (div.get(j) % div.get(k) == 0) {
                    num[j] = num[j] - num[k] + MOD;
                    num[j] %= MOD;
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