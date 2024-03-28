Below is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        double result = Math.floor(n) + 1 > n * Math.sqrt(2) 
                        ? Math.floor(n) + 1 
                        : n * Math.sqrt(2);
        
        System.out.println(result);
        scanner.close();
    }
}
```

This Java code does the following:

- It imports the `Scanner` class for reading input from the user.
- It then reads a double value from the user using `nextDouble()`.
- It computes the result using the ternary operator which checks the condition `Math.floor(n) + 1 > n * Math.sqrt(2)` similar to `n // 1 + 1` in Python. The `Math.floor()` method is used in Java to get the largest integer value that is less than or equal to the argument (equivalent to `//` in Python for float inputs).
- It prints out the resultant value.
- Finally, it closes the scanner to prevent resource leakage.
