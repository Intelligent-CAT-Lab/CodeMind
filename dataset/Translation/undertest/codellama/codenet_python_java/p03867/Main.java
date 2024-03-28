import java.util.Scanner;

public class p03867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;
        int i = 1;
        int M = N;
        int[] div = new int[N];
        while (i * i <= N) {
            if (N % i == 0) {
                div[i] = i;
                if (N / i != i) {
                    div[i] = N / i;
                }
            }
            i++;
        }

        div = sort(div);
        int N1 = div.length;
        int[] num = new int[N1 + 1];
        int ans = 0;
        for (int i = 0; i < N1; i++) {
            num[i] = (int) Math.pow(K, (div[i] + 1) / 2, MOD);
            for (int j = 0; j < i; j++) {
                if (div[i] % div[j] == 0) {
                    num[i] = (num[i] - num[j] + MOD) % MOD;
                }
            }

            if (div[i] % 2 == 0) {
                ans += div[i] * num[i] / 2;
                ans %= MOD;
            } else {
                ans += div[i] * num[i];
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }

    public static int[] sort(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
}