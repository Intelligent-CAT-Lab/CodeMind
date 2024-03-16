Here's the translation of the given Python code to Java:

```java
import java.util.Scanner;

public class CombinationsModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (k > n) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= (n - i);
            ans /= i;
        }

        ans %= 1000000007;
        System.out.println(ans);

        scanner.close();
    }
}
```

This Java code takes two integers as input, just like the original Python code. It then computes the same formula and outputs the result.

*Note: The division used in the Python code is integer division (which discards any fraction), so I have directly used the `/` operator in Java as it inherently performs integer division when used with integer types. However, given that the division may not always produce an integer result, a better approach would be to use modular multiplicative inverse to perform division under modulus. But to keep the translation close to the original logic, I have stuck with the simple division.*

Remember to compile and run the Java code to test it with your sample input to ensure it works as expected.
