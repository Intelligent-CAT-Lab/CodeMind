import java.util.Scanner;

public class p02332 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        if (K < N) {
            System.out.println(0);
        } else {
            int ans = 1;
            for (int v = K; v > K - N; v--) {
                ans = (ans * v) % MOD;
            }
            System.out.println(ans);
        }
    }
}