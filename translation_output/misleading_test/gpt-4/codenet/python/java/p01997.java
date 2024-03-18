Below you'll find the Java equivalent of the provided Python code snippet, including a method to parse the input and calculate the required result following the format in your sample test case.

```java
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        scanner.close();

        double result = (4.0 / 3.0) * PI * pow(B, 3);

        // Output the result with the specified format
        System.out.printf("%.10f%n", result);
    }
}
```

You would compile and run this Java program, and it would wait for input in the same format as the provided test input ("1 2"). Once provided, it will output the expected result, similar to the output from the Python code.

Note: The Python code doesn't use the variable `A`, so it is read but not used in the Java translation for consistency. If `A` was meant to be used in some way, then we should adjust the Java code accordingly. The same holds for number formatting; in Java, `printf` is used to maintain the formatting of the output to 10 decimal places.
