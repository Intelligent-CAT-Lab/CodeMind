Here's the Java equivalent of the Python code provided:

```java
import java.util.Scanner;

public class DivModExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input
        int input = scanner.nextInt();
        
        // Calculate divmod equivalent
        int multipliedInput = input * 2;
        int div = multipliedInput / 60; // Equivalent to div
        int mod = multipliedInput % 60; // Equivalent to mod
        
        // Output the result
        System.out.println(div + " " + mod);
        
        scanner.close();
    }
}
```

To compile and run this Java code, you would execute it in an environment where Java is installed, supplying the test input '0' when prompted. It should output `0 0` as expected.
