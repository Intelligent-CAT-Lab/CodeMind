Below is the translated Java code that reads two integers from the standard input, performs the calculation as per the Python script, and prints the resulting value with 10 decimal places of precision.

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculateRatio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Reading the first line of input and splitting it into two integers
            String[] input = scanner.nextLine().split("\\s+");
            int r1 = Integer.parseInt(input[0]);
            int r2 = Integer.parseInt(input[1]);

            double result = 1.0 / ((double) (r2 + r1) / (r1 * r2));
            System.out.printf("%.10f%n", result);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Invalid input. Please enter two integers separated by a space.");
        } finally {
            scanner.close();
        }
    }
}
```

In the Java code:

1. We use the `Scanner` class from `java.util` to read from standard input.
2. We catch any exceptions related to input mismatch or number format, to handle any input that's not two space-separated integers.
3. We use `System.out.printf` to format the output with 10 decimal places, similar to the Python `%f` string formatting specifier.
4. We handle any exceptions related to input mismatch or number format to ensure the input is valid.
5. We use a try-finally block to make sure the `Scanner` object is closed to prevent any resource leaks, but a try-with-resources block would be preferred for actual Java code.
