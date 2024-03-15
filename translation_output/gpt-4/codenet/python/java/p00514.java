Certainly! Below is the equivalent Java code for the Python script you provided. It replicates the calculation logic of combinations and serves the same purpose as the original Python code.

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, r;
        n = scanner.nextInt();
        m = scanner.nextInt();
        r = scanner.nextInt();

        int[] arr = { n - 1, r - m * n };
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];

        long d = 1;
        for (int i = 0; i < a; i++) {
            d *= (i + 1);
        }

        long u = 1;
        for (int i = 0; i < a + b; i++) {
            u *= (i + 1);
        }

        long result = a < 1 ? 0 : u / d;
        System.out.println(result);

        scanner.close();
    }
}
```

Please note the following details about translating the code:

- Java requires explicit type declarations, so we declare variables using types like `int` and `long`.
- `Scanner` class is used for reading inputs from the standard input stream (the console).
- Arrays must be sorted using the `Arrays.sort()` method in Java.
- We use `long` for the factorial calculations to avoid integer overflow.
- Java requires a class declaration (`Main` in this case), and all executable code should be placed within a `main` method.
- Unlike Python, Java code is enclosed inside classes, and variables and operations are type-checked at compile time.
- Java does not have a built-in factorial operation, so we calculate it using iterative multiplication.
- We've also used a different strategy to avoid an integer overflow during factorial calculations by doing the division at the end, similar to the reduction step in Python.
