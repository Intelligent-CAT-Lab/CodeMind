Here is the equivalent Java code for the given Python snippet. This Java code reads three integers, performs a calculation in a loop, and prints the result:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read three integers from the user input
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        
        // Perform the calculation and print results for 10 iterations
        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }

        scanner.close();
    }
}
```

To ensure the code works as expected, make sure to import the `Scanner` class for reading standard input, and always close the scanner to avoid any resource leaks. The main logic within the `for` loop is a direct translation of the Python code, with the addition of type declarations that are required in Java.
