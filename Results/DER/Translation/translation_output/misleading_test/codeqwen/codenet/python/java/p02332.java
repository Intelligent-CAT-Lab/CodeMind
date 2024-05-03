Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        if (K < N) {
            System.out.println(0);
        } else {
            int ans = 1;
            for (int v = K; v > K-N; v--) {
                ans = (ans * v) % MOD;
            }
            System.out.println(ans);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the factorial of the second integer (K), and then prints the result modulo 10^9 + 7. If the second integer (K) is less than the first integer (N), it prints 0.
