Below is the translated Java code based on the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] ans = new String[(1 << n) - 1][(1 << m) - 1];

        // Initialize the ans array with "1" values
        for (int i = 0; i < (1 << n) - 1; i++) {
            for (int j = 0; j < (1 << m) - 1; j++) {
                ans[i][j] = "1";
            }
        }

        // Perform the operations as in the Python code
        for (int k = 1; k < 11; k++) {
            for (int i = (1 << k); i < (1 << n); i += (1 << k)) {
                for (int j = (1 << k); j < (1 << m); j += (1 << k)) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }

        // Print the result as in the Python code
        for (int i = 0; i < (1 << n) - 1; i++) {
            for (int j = 0; j < (1 << m) - 1; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
```

This code should produce the same output for the given sample test input and expected output when run in a Java environment. It reads input from the console, processes it similar to the Python code, and prints the output to the console.

Remember that Java syntax is quite different from Python's, resulting in significantly more verbose code. The `1 << n` and `1 << m` operations are used to achieve the effect of `2**n` and `2**m`, which are power operations in Python. These operations are equivalent to multiplying by two raised to the power of `n` or `m` respectively in binary. Additionally, in Java, we have to declare the size of the arrays before we can use them, and we use `equals` to compare strings instead of `==`.
