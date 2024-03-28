import java.util.*;
import java.math.*;

public class p02715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = 1000000007;
        int[] X = new int[K + 1];
        X[1] = 1;
        for (int i = 2; i <= K; i++) {
            X[i] = X[i - 1] + i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
        }
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            ans += X[i] * Math.pow(K / i, N, P);
            ans %= P;
        }
        System.out.println(ans);
    }
}