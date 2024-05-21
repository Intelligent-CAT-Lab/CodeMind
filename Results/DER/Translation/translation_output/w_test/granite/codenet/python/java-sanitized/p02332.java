import java.util.*;

public class p02332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = (int)Math.pow(10, 9) + 7;

        if (K < N) {
            System.out.println(0);
        } else {
            long ans = 1;
            for (int v = K; v >= K - N + 1; v--) {
                ans = (ans * v) % MOD;
            }
            System.out.println(ans);
        }
    }
}