Here is the Python code translated into Java with a sample test case included:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();

        // Calculate midpoint
        double mx = w / 2;
        double my = h / 2;

        // Initialize result array
        double[] res = new double[2];

        // Calculate area and check for center
        res[0] = w * h / 2;
        res[1] = (x == mx && y == my) ? 1 : 0;

        // Print result
        System.out.println(res[0] + " " + (int)res[1]);
    }
}
```

When you input "2 3 1 2", the expected output is "3.0 0". It is important to note that integer division in Python will result in a float if one of the operands is a float. In Java, it will always result in a double if one of the operands is a double. Hence, you don't need to explicitly cast the result of a division if one of the operands is already a double.

However, the expected output you provided seems to be inconsistent with the input based on the logic of the code. If the input is "2 3 1 2" then according to the Python code provided, the output should be "3.0 0" rather than "6.8558008881848735 82". Please make sure that the input and expected output are indeed correct for the provided code before running the translated Java code.
