Here is the equivalent Java code that performs the same task as the Python code you provided:

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class PrimeFactorCounter {

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<Integer, Integer> count = new HashMap<>();
        long ans = 1;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            int temp = i;
            boolean isPrime = true;

            for (int n : num) {
                while (temp % n == 0) {
                    count.put(n, count.get(n) + 1);
                    temp /= n;
                }
                if (temp == 1) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                num.add(temp);
                count.put(temp, 1);
            }
        }

        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

Please note a few things about translating the code from Python to Java:

1. Java requires defining the class and method structure, so the code is wrapped inside a public class with a `main` method, which is the standard entry point for a Java application.
   
2. Java uses `HashMap` for storing key-value pairs, similar to Python's `Counter`. The `HashMap` needs explicit updates as Java does not have a direct equivalent of the `Counter` that auto-initializes keys.

3. In Java, you must specify the type of each variable explicitly. Therefore, variables and collections must have their types declared, such as `int`, `long`, `HashMap`, and `ArrayList`.

4. Java lacks a built-in `else` clause for `for` loops like Python has. To achieve the same effect, I used a boolean to determine if the number is prime after the inner loop execution.

5. The use of `%` and `/=` in the inner loop is replaced with `%` and `/` in Java, with explicit assignment.

6. It's best practice to close resources like `Scanner` in Java, which is not typically done in Python with the `input` function.

7. Java uses `System.out.println()` to output to the console instead of Python's `print()` function.
