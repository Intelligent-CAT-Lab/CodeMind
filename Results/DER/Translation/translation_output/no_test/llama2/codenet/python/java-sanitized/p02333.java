import java.util.Scanner;

public class p02333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += (k - i) * (k - i) * (k - i) * combination(k, i);
                } else {
                    ans -= (k - i) * (k - i) * (k - i) * combination(k, i);
                }
            }
            ans = ans % 1000000007;
        }
        System.out.println(ans);
    }

    public static int combination(int i, int j) {
        return (int) (Math.factorial(i) / Math.factorial(i - j) / Math.factorial(j));
    }
}