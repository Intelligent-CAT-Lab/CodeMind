Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            System.out.println((n < 3) ? "" : String.join(" ", String.valueOf((i - ~(Math.pow(n % 2 < (i + 2 < n > i * 2) ? 1 : -1, n) + 1)) % n + 1)));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then it prints out a pattern based on the input. The pattern is created by iterating over a range of numbers from 0 to `n - 2 / n`, and for each number `i`, it calculates a value based on the formula `(i - ~(Math.pow(n % 2 < (i + 2 < n > i * 2) ? 1 : -1, n) + 1)) % n + 1`. This value is then converted to a string and joined together with spaces to form a single string. This string is then printed out. The process is repeated for each number in the range.
