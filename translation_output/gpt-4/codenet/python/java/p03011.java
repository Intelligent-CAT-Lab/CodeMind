Here's the equivalent Java code that achieves the same result as the given Python code. This Java code reads three integers from the user, calculates their sum, and subtracts the maximum of the three numbers from the sum to print the result.

```java
import java.util.Scanner;

public class SumMinusMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers from the user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate the sum of the integers
        int sum = a + b + c;

        // Find the maximum of the three integers
        int max = Math.max(a, Math.max(b, c));

        // Print the sum minus the maximum
        System.out.println(sum - max);

        scanner.close();
    }
}
```

To use this Java program, compile and run it. It will wait for the user to input three integers separated by spaces, just like in the Python version. After the input is provided and the "Enter" key is pressed, it will output the desired result.
