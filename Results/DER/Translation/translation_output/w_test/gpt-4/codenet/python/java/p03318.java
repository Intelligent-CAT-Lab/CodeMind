Below is the translation of the provided Python code to Java. The Java code includes only the `D` function as per the provided Python code, as well as a `main` method to handle input and output similar to the test case provided.

```java
import java.util.Scanner;

public class Solution {
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int K = in.nextInt();
        solveD(K);
    }

    public static void solveD(int K) {
        long ans = 1;
        int i = 0;
        while (K > 0) {
            System.out.println(ans);
            K -= 1;
            if (check(ans, i)) {
                i++;
            }
            ans += Math.pow(10, i);
        }
    }

    private static double sunuke(long a) {
        return (double) a / sumOfDigits(a);
    }

    private static int sumOfDigits(long a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    private static boolean check(long ans, int i) {
        return sunuke(ans + (long) Math.pow(10, i)) > sunuke(ans + (long) Math.pow(10, i + 1));
    }
}
```

To use this Java solution:

1. Save the code in a file named `Solution.java`.
2. Compile the Java program using the `javac Solution.java` command.
3. Run the compiled class with the `java Solution` command.
4. Enter the test input (e.g., `10`) when prompted, and press Enter.

The expected output will be printed to the console, just like in the Python version of the code.
