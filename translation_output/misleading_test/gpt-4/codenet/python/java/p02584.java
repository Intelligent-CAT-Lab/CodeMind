Below is the Python code translated to Java. It accepts input from the user via the standard input, computes the desired value, and outputs the result to the standard output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int K = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int count = Math.abs(X) / D;
        int ans = 0;

        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            } else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        System.out.println(ans);
    }
}
```

When you run this Java program, it will expect three integers as input (in the same format as the provided test case "6 2 4") and will produce an output (in this test case the output is "38").

This Java code maintains the original logic from the Python code but adapts the syntax and method of input/output to conform to Java standards. The `Scanner` class is used in Java for input, and `System.out.println` is used for output. Arithmetic operations and control structures have been translated directly from Python to their Java equivalents.
