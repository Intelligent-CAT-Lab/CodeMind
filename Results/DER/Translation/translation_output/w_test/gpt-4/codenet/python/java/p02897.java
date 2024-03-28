Certainly! Below is the equivalent Java code for the given Python script. In Java, we will use a `Scanner` to read the input from the user, and then we will perform the desired calculation.

```java
import java.util.Scanner;

public class HalfDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close(); // close the scanner after we're done using it

        // In Java, we don't have Python's // operator, so we simulate it with
        // (N + 1) / 2 for the ceiling division if N is odd
        double result = ((N % 2 == 0) ? (N / 2) : ((N + 1) / 2)) / (double) N;
        System.out.printf("%.10f\n", result);
    }
}
```

For the provided test input, the above Java program would output:

```
0.5000000000
```

Just as expected from the Python code that was provided. Remember that in Java, we typically format the output using `System.out.printf` when we need to control the number of decimal places in floating-point numbers. The `%.10f` format specifier ensures that the result is printed with 10 decimal places.
