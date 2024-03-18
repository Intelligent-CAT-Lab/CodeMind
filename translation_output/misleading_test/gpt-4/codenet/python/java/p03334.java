Here's the translated Java code for the given Python code. This code includes the necessary methods and classes to achieve the equivalent functionality:

```java
import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();

        Judge j1 = judge(D1);
        Judge j2 = judge(D2);
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (j1.apply(x, y) && j2.apply(x, y)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        scanner.close();
                        return;
                    }
                }
            }
        }
        scanner.close();
    }

    private static Judge judge(int D) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        if (D % 2 == 1) {
            return (x, y) -> (~((x / n + y / n) % 2)) != 0;
        } else {
            return (x, y) -> (~((x / n) % 2)) != 0;
        }
    }

    interface Judge {
        boolean apply(int x, int y);
    }
}
```

This Java code includes a `main` method to accept input just like the Python one—it reads from standard input using `Scanner`, and outputs to standard output using `System.out.println()`. The code defines a `judge` method like in the Python code, using the same logic to decide which type of `Judge` to return. Note that lambda expressions are used in Java to express the functional interfaces implementations for `h1` and `h2`.
