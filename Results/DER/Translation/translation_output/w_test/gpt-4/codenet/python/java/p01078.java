Below is the translated Java code. Java uses the `Math` class for mathematical functions such as `sin()`, `cos()`, and `acos()`, which corresponds to `sec()` because `sec(x) = 1 / cos(x)`. Note that, in Java, user input is typically handled with a `Scanner` object for console input.

```java
import java.util.Scanner;
import java.lang.Math;

public class StarProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        double PI = Math.PI; // Math.PI is a predefined constant in Java's Math class.
        double result = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.printf("%.8f\n", result);
    }
}
```

For the provided test case (input: 5 2), when running this Java program with the input, it should give the expected output (1.12256994).

Please ensure to compile and run Java code with the appropriate environment, classpath, and permissions. The `StarProblem` class has a `main` method that will execute upon running the code.
