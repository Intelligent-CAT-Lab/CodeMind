Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double d = scanner.nextDouble();
        double x = scanner.nextDouble();
        System.out.println(main(N, d, x));
    }

    public static double main(int N, double d, double x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N-0.5) * x;
            d = d + (d/N) + (5*x)/(2*N);
            x += 2*x/N;
            N -= 1;
        }
        return ret;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, calculates the result of the `main` function, and prints the result. The `main` function is the same as your Python function. It calculates the result of the expression `d + (N-0.5) * x`, adds the result of the expression `(d/N) + (5*x)/(2*N)`, adds the result of the expression `2*x/N`, and subtracts 1 from `N`. It repeats this process until `N` is less than or equal to 0. The result is returned by the `main` function.
