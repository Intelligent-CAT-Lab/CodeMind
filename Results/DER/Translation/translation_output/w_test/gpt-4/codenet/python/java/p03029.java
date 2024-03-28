Certainly! Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class ApplesAndPencils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt(); // Reads the first integer input for 'a'
        int p = scanner.nextInt(); // Reads the second integer input for 'p'

        System.out.println((3 * a + p) / 2); // Calculates and prints the result

        scanner.close(); // Closes the scanner
    }
}
```

Don't forget to include the import statement for the Scanner utility, as it's needed for input operations in Java. Run this code by providing the input separated by a space, similar to how you would provide the input for the Python code.
