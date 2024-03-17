import java.util.Scanner;

public class p02335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        int C = 1;
        for (int i = n - k + 1; i <= n; i++) {
            C = (C * i) % MOD;
        }

        int H = 1;
        for (int i = 1; i <= k; i++) {
            H = (H * i) % MOD;
        }

        int result = C * H % MOD;
        System.out.println(result);
    }
}