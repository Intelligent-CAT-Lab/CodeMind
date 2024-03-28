Below is the equivalent Java code that performs the same operation as the provided Python code. To use `sin` and `cos` functions, as well as to convert degrees to radians, we will utilize the `Math` class from the `java.lang` package.

Make sure you import the `java.util.Scanner` class for input and `java.lang.Math` for mathematical operations.

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        double cInRadians = Math.toRadians(c);
        double sinC = Math.sin(cInRadians);
        double cosC = Math.cos(cInRadians);

        double area = 0.5 * a * b * sinC;
        double length = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*cosC);
        double height = b * sinC;

        System.out.printf("%.8f\n", area);
        System.out.printf("%.8f\n", length);
        System.out.printf("%.8f\n", height);

        scanner.close();
    }
}
```

This Java program reads three integers from the standard input, which are the sides of the triangle and the angle in degrees between them, computes the required values, and prints them out formatted to 8 decimal places (similar to the Python code's implicit formatting for floating-point numbers).

When you run this program with the input `4 3 90`, it will produce the output:

```
6.00000000
12.00000000
3.00000000
```

This output is the same as the expected output for the provided test case.
