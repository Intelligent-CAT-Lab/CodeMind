import java.util.Scanner;

public class p02333 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int modulo = (int) Math.pow(10, 9) + 7;
        int ans = 0;

        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += (int) (Math.pow(k - i, n) * combination(k, i));
                } else {
                    ans -= (int) (Math.pow(k - i, n) * combination(k, i));
                }
            }
            ans %= modulo;
        }

        System.out.println(ans);
    }

    public static int combination(int i, int j) {
        return factorial(i) / (factorial(i - j) * factorial(j));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}