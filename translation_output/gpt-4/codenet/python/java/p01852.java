Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Close the scanner to avoid resource leaks (optional but recommended)
        scanner.close();  
        System.out.println(n != 0 ? Integer.toBinaryString(n).length() : 0);
    }
}
```

This Java code does the following:
- Imports the `Scanner` class for taking input from the user.
- Defines a `Main` class with a `main` method (the entry point of the program).
- Creates a `Scanner` object to read input from the standard input (console).
- Reads an integer `n` from the user.
- Closes the `Scanner`.
- Checks if `n` is not zero, converts it to a binary string, and prints its length. Otherwise, it prints `0`.
