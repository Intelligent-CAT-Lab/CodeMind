```java
import java.util.Scanner;

public class Main {
    private static final long MOD = (long) Math.pow(10, 9) + 7;

    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    private static long P(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    private static long C(int n, int r) {
        return P(n, r) / factorial(r);
    }

    private static long H(int n, int r) {
        return C(n + r - 1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n < k) {
            System.out.println(C(k, n) % MOD);
        } else if (n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```
