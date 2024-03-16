Below is the Java equivalent of the given Python code. The Java version takes input from the command line, performs the division and modulus operation to get the quotient and modulus, and then prints out `1` or `0` based on the condition.

```java
import java.util.Scanner;

public class DivmodCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Get input

        int q = N / 100;           // Integer division to get quotient
        int mod = N % 100;         // Modulus to get remainder

        // Print 1 if mod is less than or equal to q * 5, else 0
        System.out.println(mod <= q * 5 ? 1 : 0);

        scanner.close(); // Close the scanner
    }
}
```

Ensure you have a `Scanner` object to read from `System.in`. In Java, `System.out.println` is used to print to standard output. The ternary operator `?:` is the equivalent of the `if-else` used in the Python code. Java also requires explicit type declarations and uses semicolons to end statements.
