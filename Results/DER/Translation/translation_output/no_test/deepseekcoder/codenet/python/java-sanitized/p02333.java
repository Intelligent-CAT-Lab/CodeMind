import java.util.Scanner;

public class p02333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long modulo = (long) Math.pow(10, 9) + 7;
        long ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += pow((k - i), n) * combination(k, i);
                } else {
                    ans -= pow((k - i), n) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static long combination(int i, int j) {
        return factorial(i) / (factorial(i - j) * factorial(j));
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long pow(int base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= base;
            }
            exponent >>= 1;
            base *= base;
        }
        return result;
    }
}