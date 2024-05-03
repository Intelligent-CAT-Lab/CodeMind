Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int modulo = (int) Math.pow(10, 9) + 7;
        int ans = 0;
        if (k <= n) {
            for (int i = 0; i <= k; i++) {
                if (i % 2 == 0) {
                    ans += (int) Math.pow(k - i, n) * combination(k, i);
                } else {
                    ans -= (int) Math.pow(k - i, n) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static int combination(int i, int j) {
        int factI = 1;
        for (int x = 1; x <= i; x++) {
            factI *= x;
        }
        int factJ = 1;
        for (int x = 1; x <= j; x++) {
            factJ *= x;
        }
        int factIj = 1;
        for (int x = 1; x <= i - j; x++) {
            factIj *= x;
        }
        return factI / (factJ * factIj);
    }
}
```

Please note that in Java, we use `Math.pow` to calculate the power of a number, and we use `int` to cast the result of `Math.pow` to an integer. Also, Java does not have a built-in factorial function, so we have to implement it manually.
