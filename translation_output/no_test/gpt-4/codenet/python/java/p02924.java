Below is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        System.out.println((n - 1) * n / 2);
        
        scanner.close();
    }
}
```

This Java code does the following:
- Imports the `Scanner` class for input operations.
- Declares the `Main` class.
- Contains the `main` method, the entry point of the program.
- Creates an instance of the `Scanner` to read an integer from the standard input (similar to `input()` in Python).
- Calculates `(n - 1) * n / 2` using integer division (as in the Python code) and prints the result.
- Closes the scanner to prevent potential resource leaks.
