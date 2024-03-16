Here's the Java equivalent of the provided Python code including the handling of input and output. I'm using `Scanner` class from `java.util` for input and `System.out.printf` for formatted output.

```java
import java.util.Scanner;

public class DivisionCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        int a = scanner.nextInt(); // Read the first number
        int b = scanner.nextInt(); // Read the second number
        scanner.close(); // Close the scanner
        
        int division = a / b; // Integer division
        int remainder = a % b; // Remainder of the division
        double preciseDivision = (double) a / b; // Floating-point division
        
        // Print the results in the specified format
        System.out.printf("%d %d %.5f", division, remainder, preciseDivision);
    }
}
```

Please note that you need to compile the Java code with a Java compiler and then run the compiled class file to see the test input producing the expected output. The behavior should match the Python code's functionality based on your example test case.
