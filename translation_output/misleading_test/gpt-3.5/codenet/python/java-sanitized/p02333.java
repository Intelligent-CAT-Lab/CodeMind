import java.util.Scanner;

public class p02333 {

    static long combination(int i, int j) {
        return factorial(i) / (factorial(i - j) * factorial(j));
    }

    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long modulo = (long) Math.pow(10, 9) + 7;
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
}