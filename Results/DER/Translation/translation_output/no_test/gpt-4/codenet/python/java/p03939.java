Here's the translated version of the provided Python code into Java. Note that in Java, we don't have direct access to the system's stdin buffer as we do in Python, so I'm going to use a `Scanner` to read from `System.in`:

```java
import java.util.Scanner;

public class CalculationProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double d = scanner.nextDouble();
        double x = scanner.nextDouble();
        
        scanner.close();

        double result = calculate(N, d, x);
        System.out.println(result);
    }

    private static double calculate(int N, double d, double x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N -= 1;
        }
        return ret;
    }
}
```

In Java, you typically structure the code with classes and methods. The `Scanner` is used for reading input from `System.in`, and the calculation logic is encapsulated in a separate method. Whether to close the `Scanner` or not depends on the particular context; if you plan to use `System.in` elsewhere after this, you might not want to close it as closing the `Scanner` will also close the underlying input stream. However, in this standalone program, closing the scanner is appropriate after reading all the input.
