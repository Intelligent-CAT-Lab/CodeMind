Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int[] result = rec(a, b);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }

    public static int[] rec(int a, int b) {
        assert a >= b;
        int q = a / b;
        int r = a % b;
        if (r == 0) {
            return new int[]{0, 1, b};
        }
        int[] result = rec(b, r);
        int x = result[1];
        int y = result[0] - q * result[1];
        int gcd = result[2];
        return new int[]{y, x, gcd};
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calls the `rec` function with these integers, and prints the result. The `rec` function is a recursive function that calculates the coefficients of Bézout's identity.
