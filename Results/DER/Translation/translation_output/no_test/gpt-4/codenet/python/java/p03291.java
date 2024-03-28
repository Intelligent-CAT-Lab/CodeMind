Below is the translation of your provided Python code into Java. In Java, we need to deal with more explicit type definitions, input handling, and array creation.

```java
import java.util.Scanner;

public class DPConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        long[][] dp = new long[n + 1][4];
        char[] string = {'A', 'B', 'C'};
        final long num = 1000000007;
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                long m = 0;
                long b = 1;
                if (s.charAt(i) == '?') {
                    b = 3;
                }
                if (j == 0) {
                    if (s.charAt(i) == '?') {
                        dp[i + 1][j] = (dp[i][j] * 3) % num;
                    } else {
                        dp[i + 1][j] = dp[i][j] % num;
                    }
                    continue;
                }
                if (s.charAt(i) == string[j - 1] || s.charAt(i) == '?') {
                    m = 1;
                }
                dp[i + 1][j] = (m * dp[i][j - 1] + b * dp[i][j]) % num;
            }
        }

        System.out.println(dp[n][3]);
        scanner.close();
    }
}
```

In this Java program:

- We have used `Scanner` to read input from the user.
- Java doesn't need explicit casting for the result of modulus operation when using `long`.
- In Java, the length of a string is called using the `length()` method instead of `len()`.
- Arrays in Java are created with specific sizes, and the "new" keyword is used for creating instances.
- The modulus operation is the same in both languages (%).
- We use `charAt` to access a character of a string in Java since strings are not directly indexed like Python lists or strings.
- Java doesn't have the Pythonic "print" statement, so we use `System.out.println` to output our final result.
- The Java program ends with gracefully closing the `Scanner` object.
