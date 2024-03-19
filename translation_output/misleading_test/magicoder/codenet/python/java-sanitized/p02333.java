import java.util.Scanner;

public class p02333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long modulo = 1000000007;
        long ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += Math.pow(k - i, n) * combination(k, i);
                } else {
                    ans -= Math.pow(k - i, n) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static long combination(int i, int j) {
        long result = 1;
        for (int x = 1; x <= j; x++) {
            result = result * (i - x + 1) / x;
        }
        return result;
    }
}