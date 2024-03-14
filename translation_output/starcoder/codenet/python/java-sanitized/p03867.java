import java.util.*;
import java.math.*;

public class p03867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;
        int i = 1;
        int M = N;
        List<Integer> div = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i!= i) {
                    div.add(N / i);
                }
            }
            i++;
        }

        div.sort(Comparator.naturalOrder());
        int N1 = div.size();
        int[] num = new int[N1 + 1];
        int ans = 0;
        for (int i1 = 0; i1 < N1; i1++) {
            num[i1] = (int) Math.pow(K, (div.get(i1) + 1) / 2, MOD);
            for (int j = 0; j < i1; j++) {
                if (div.get(i1) % div.get(j) == 0) {
                    num[i1] -= num[j];
                    num[i1] += MOD;
                    num[i1] %= MOD;
                }
            }

            if (div.get(i1) % 2 == 0) {
                ans += div.get(i1) * num[i1] / 2;
                ans %= MOD;
            } else {
                ans += div.get(i1) * num[i1];
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }
}