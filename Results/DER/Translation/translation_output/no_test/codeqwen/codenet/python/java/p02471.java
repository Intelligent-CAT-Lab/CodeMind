Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a < b) {
            int[] result = rec(b, a);
            System.out.println(result[0] + " " + result[1] + " " + result[2]);
        } else {
            int[] result = rec(a, b);
            System.out.println(result[0] + " " + result[1] + " " + result[2]);
        }
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
        return new int[]{x, y, gcd};
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, and then calls the `rec` function to find the solution. The `rec` function is a recursive function that calculates the coefficients `x` and `y` and the greatest common divisor `gcd` of two numbers `a` and `b`. The result is returned as an array of three integers. The main function then prints the result.
