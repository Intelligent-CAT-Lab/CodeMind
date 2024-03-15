Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class CombinationModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        if (k > n) {
            System.out.println(0);
            return;
        }

        int ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= n - i;
            ans /= i;
            ans %= 1000000007;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

Please note that in Java, integer division can result in truncation if the value is not exactly divisible. The Python code uses `//` for floor division to ensure the result is an integer. In Java, since we are using `int` type for `ans`, the division `/` is already an integer division.

Also note that in Java, when dealing with large numbers and modulo operations, it's common to use `long` instead of `int` to avoid overflow. If `n` and `k` are large, the multiplication `ans *= n - i` could result in a value that exceeds the maximum value of an integer, even before the modulo operation is applied. If you expect `n` and `k` to be large, consider using `long` for `ans` and cast the literals accordingly. Here is a version using `long`:

```java
import java.util.Scanner;

public class CombinationModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        if (k > n) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= n - i;
            ans /= i;
            ans %= 1000000007L; // Use 'L' to denote a long literal
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

Remember that integer division in Java discards the fractional part. If you need to replicate Python's `//` operator more precisely (which is not needed in this case since we are dealing with integers), you might need more complex logic or use BigDecimal for arbitrary-precision arithmetic.
