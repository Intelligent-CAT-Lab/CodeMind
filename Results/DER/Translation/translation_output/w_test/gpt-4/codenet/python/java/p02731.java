Here is the Java version of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input
        int L = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the volume of the cube
        double hen = (double) L / 3;
        System.out.printf("%.12f%n", hen * hen * hen);
    }
}
```

For the test input of `3`, this Java code will output `1.000000000000` as expected. It reads an integer from the standard input, calculates the volume of the cube whose each side is a third of the input length, and prints the result with 12 decimal places as in the Python code.
