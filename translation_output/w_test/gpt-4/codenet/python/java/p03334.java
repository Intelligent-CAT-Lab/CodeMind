Sure, here's the equivalent Java code of your Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();

        Judge j1 = judge(D1);
        Judge j2 = judge(D2);

        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (j1.check(x, y) && j2.check(x, y)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        sc.close();
                        return;
                    }
                }
            }
        }
        sc.close();
    }

    public static Judge judge(int D) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }

        if (D % 2 == 1) {
            return (x, y) -> {
                return ~((x / n + y / n) % 2) == -1;
            };
        } else {
            return (x, y) -> {
                return ~((x / n) % 2) == -1;
            };
        }
    }

    // Functional interface for Judge
    @FunctionalInterface
    interface Judge {
        boolean check(int x, int y);
    }
}
```

Before running the code, make sure you have your Java environment correctly set up to compile and run Java programs.

Here's a brief explanation of the differences between the Python and Java code:

- Java has strict type definitions, so variables and method returns must have defined types.
- Java uses interfaces for the Python-like anonymous functions (lambdas). The `Judge` functional interface is introduced for this purpose.
- The main method contains a similar logic to the Python code but uses Java's syntax and standard input handling.
- The `judge()` method returns an instance of `Judge` that corresponds to the functions `h1` and `h2` in the original Python code. It makes use of lambda expressions for return.
- Instead of Python's `print()`, Java uses `System.out.println()` for console output.
- The bitwise NOT operator in Java is `~`, which operates identically to Python's. However, to force the correct interpretation of the bitwise complement in Java, we compare the result with `-1` instead of `1` because in Java the bitwise NOT operator produces a negative number.
- A `Scanner` object is used for input in place of Python's `input()`.

Remember that Java code must be placed in a file with the same name as the public class (`Main.java` in this case) and executed with the Java runtime environment.
