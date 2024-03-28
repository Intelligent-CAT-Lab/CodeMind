Here is the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n - 1) * n / 2);
        scanner.close();
    }
}
```

This Java program performs the same calculation as the original Python code you provided and outputs the result when it's run with the input `2`, the expected output would be `-65`. However, I should clarify that in the original Python code with an input of `2`, the expected output is `1` because the formula computes the sum of the first `n - 1` natural numbers. The output `-65` does not seem accurate based on the given formula. If there's a different logic or context please provide it, otherwise, I've translated the provided Python code as-is into Java.
