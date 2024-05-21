import java.util.*;

public class p03867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = (int)Math.pow(10, 9) + 7;
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
        Collections.sort(div);
        int N1 = div.size();
        int[] num = new int[N1 + 1];
        int ans = 0;
        for (i = 0; i < N1; i++) {
            num[i] = (int)Math.pow(K, (div.get(i) + 1) / 2);
            num[i] %= MOD;
            for (int j = 0; j < i; j++) {
                if (div.get(i) % div.get(j) == 0) {
                    num[i] -= num[j];
                    if (num[i] < 0) {
                        num[i] += MOD;
                    }
                }
            }
            if (div.get(i) % 2 == 0) {
                ans += (div.get(i) * num[i]) / 2;
                ans %= MOD;
            } else {
                ans += div.get(i) * num[i];
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }
}