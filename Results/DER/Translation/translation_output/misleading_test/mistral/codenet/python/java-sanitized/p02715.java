import java.util.*;

public class p02715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long P = 1000000007;
        int[] X = new int[K + 1];
        Arrays.fill(X, 0);
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * Math.pow(K / i, N, P);
        }
        System.out.println(ans % P);
    }
}