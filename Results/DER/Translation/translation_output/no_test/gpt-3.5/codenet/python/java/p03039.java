```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        int INF = (int) Math.pow(10, 9) + 7;

        if (n <= m) {
            int M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * Math.pow(m, 2) + M;
                    }
                    ans %= INF;
                }
            }
        } else {
            int temp = n;
            n = m;
            m = temp;
            int M = -(m - 1) * m * (2 * m - 1) / 3 + m * m * (m - 1);
            int Ms = m * m * (m - 1) / 2 - (m - 1) * m * (2 * m - 1) / 6;
            M = M % INF;
            Ms = Ms % INF;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    if (i == j) {
                        ans += Ms;
                    } else {
                        int d = j - i;
                        ans += d * Math.pow(m, 2) + M;
                    }
                    ans %= INF;
                }
            }
        }

        int factorialNm2 = factorial(n * m - 2);
        int factorialNmK = factorial(n * m - k);
        int factorialK2 = factorial(k - 2);
        BigInteger result = BigInteger.valueOf(factorialNm2)
            .divide(BigInteger.valueOf(factorialNmK).multiply(BigInteger.valueOf(factorialK2)))
            .multiply(BigInteger.valueOf(ans));
        result = result.mod(BigInteger.valueOf(INF));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```
```
