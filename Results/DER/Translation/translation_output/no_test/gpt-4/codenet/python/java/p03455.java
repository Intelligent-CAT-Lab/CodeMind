Below is the translated Java code that takes two integer inputs, multiplies them, and checks whether the result is odd or even:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        int a = scanner.nextInt();                // Read the first integer
        int b = scanner.nextInt();                // Read the second integer
        scanner.close();                          // Close the scanner
        
        int c = a * b;                            // Multiply the integers
        if (c % 2 == 1) {
            System.out.println("Odd");            // Print "Odd" if the product is odd
        } else {
            System.out.println("Even");           // Print "Even" if the product is even
        }
    }
}
```

Please note that the `Scanner` is used to read input in Java, which is a bit verbose compared to Python's `input()` function. After reading the inputs, it is a good practice to close the `Scanner` to free up resources. The rest of the logic is straightforward and similar to the Python code with Java syntax.
