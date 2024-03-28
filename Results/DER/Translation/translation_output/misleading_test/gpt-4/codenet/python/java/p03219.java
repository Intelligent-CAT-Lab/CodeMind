Here's the Java translation of the given Python code along with a sample test case:

```java
import java.util.Scanner;

public class FareCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading two integer inputs from the user
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        
        // Calculating the fare based on the provided logic
        int fare = (int) (ab + bc / 2.0);
        
        // Printing the result
        System.out.println(fare);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
```

To test the given sample input "81 58" in Java, you would need to run the above `FareCalculator` class. When the Java program prompts for input, you would enter the numbers "81 58" (without quotes), and the `Expected output` would be:

```
127
```

The input should be provided via standard input (e.g., typing into the console). The Java code takes care of the integer division and rounding down, similar to the Python code. Note that I've explicitly cast the division result to a `double` (`bc / 2.0`) before adding it to `ab`, because in Java the `/` operator when applied to two integers performs integer division. Then I cast the final result to `int` to mimic the Python behavior of `int()` casting.
