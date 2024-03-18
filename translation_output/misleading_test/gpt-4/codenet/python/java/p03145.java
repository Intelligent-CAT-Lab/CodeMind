```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set up a Scanner to read the input
        Scanner scanner = new Scanner(System.in);
        
        // Read three integer values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close(); // Close the scanner
        
        // Calculate and print the result
        System.out.println(a * b / 2);
    }
}
```

Please note that the code provided in Python does not entirely match the Python to Java translation. The Python code includes various imports and functions that are not used in the provided logic to calculate the `int(a*b/2)`. The Java translation I provided is for the logic that is actually used: the reading of three integers, and printing the product of the first two integers divided by two, which corresponds to the expected output (48 for the inputs 3 4 5).
