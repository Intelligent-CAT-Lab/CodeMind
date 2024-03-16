Below is the Java equivalent of the provided Python code. The program reads an integer from the console, calculates the product of the ceiling of half the number and the integer division (floor division) of the number by two, and prints out the result.

```java
import java.util.Scanner;
import java.lang.Math;

public class HalfProduct {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the integer input from the user
        int k = scanner.nextInt();

        // Calculate the result as the product of the ceiling of k/2 and the floor division of k by 2
        int result = (int)Math.ceil(k / 2.0) * (k / 2);

        // Print the result to the console
        System.out.println(result);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
```

Please note that in Java, you need to explicitly cast the result of `Math.ceil(double a)` to an `int` as this method returns a `double`. Additionally, since the division operator in Java already performs integer division when both operands are integers (like `k / 2`), you need to ensure at least one operand is a floating-point number (like `k / 2.0`) to get the correct ceiling calculation. Lastly, `System.in` is the standard input stream, equivalent to `input()` in Python, and `System.out.println` is used to print output to the console.

To compile and run this code, you would need to ensure that it is part of a `.java` file named `HalfProduct.java`, which must be the same name as the class defined in the code.
