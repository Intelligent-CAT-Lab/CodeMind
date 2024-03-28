Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class RatingSystem {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Read the input as an integer
        int n = scanner.nextInt();

        // Determine and print the output based on the given conditions
        if (n < 1200) {
            System.out.println("ABC");
        } else if (n < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }

        // Close the scanner
        scanner.close();
    }
}
```

To compile and test this Java code with the sample input provided (1199), follow these steps:

1. Save the code in a file named `RatingSystem.java`.
2. Compile the program using `javac RatingSystem.java` in the terminal or command prompt.
3. Execute the program with `java RatingSystem`.
4. Type `1199` and press Enter.

The expected output will be:
```
ABC
```
