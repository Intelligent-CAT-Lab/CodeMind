To translate your Python code into Java, there are a few adjustments we need to make since Java is statically typed and requires explicit definition for each variable's type. Furthermore, Java does not have a built-in equivalent to Python's `input()` or `print()`. Instead, we will use `Scanner` to read input from the user and `System.out.println()` to print the output. Here's the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input (N, A, B) from the user, equivalent to map(int,input().split()) in Python
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculating the result based on the input values
        if ((A - B) % 2 == 0) {
            // Equivalent to Python's print((B - A) // 2)
            System.out.println((B - A) / 2);
        } else {
            // Equivalent to Python's print(min(A - 1, N - B) + 1 + (B - A) // 2)
            System.out.println(Math.min(A - 1, N - B) + 1 + (B - A) / 2);
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
```

Please make sure you have imported `Scanner` at the beginning of your Java code as shown here. The `//` in Java indicates a single-line comment. The `Main` class contains the main method which is the entry point of the program. In Java, division of integers with `/` discards any remainder, replicating the floor division `//` operator from Python.
