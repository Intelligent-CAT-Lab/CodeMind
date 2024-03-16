Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class PriceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculate the minimum value among a, b, and c
        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        // Output the minimum cost
        System.out.println(Math.min(a, Math.min(b, c)));

        // Close the scanner
        scanner.close();
    }
}
```

To run the test input provided:

```
1500 2000 1600 3 2
```

You should simply compile and run the `PriceCalculation` class and provide the above input. The expected output will be:

```
7900
```

This output is the same as what the Python code would produce with the same inputs.
