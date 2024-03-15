Here's your Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = (int)Math.ceil((double)B / A);

        for (int k = _k; k < _k + (int)1e7; k++) {
            int bn = (k * A) / B;
            int rem = (k * A) % B;
            int an = rem / A;
            rem = rem % A;

            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }

        System.out.println(-1);
    }
}
```

Note some differences between Python and Java:

1. Unlike Python, Java requires a class definition and a `main` method to run the program.
2. Java uses the `Scanner` class for input, and its `nextInt()` method can be used to read two integers.
3. Java does not support tuple assignment like Python, so we assign `A` and `B` separately.
4. There is no direct equivalent of `exit()` in Java. Instead, we use `return` to exit the `main` method.
5. Java integer division rounds towards zero, whereas Python's `//` operator floors. To mimic Python's behavior for positive numbers, we use `Math.ceil` and cast the result to an `int`.
6. We must define our loop variable `k` at the beginning of our for loop in Java. Java variables have block scope, so we declare `bn`, `rem`, `an`, and `n` inside the loop block.
7. We cast `(int)1e7` (1e7 is a double literal) for the loop range to get the integer equivalent of 10^7 as required.
