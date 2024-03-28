Certainly! Below is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Implementing the logic similar to the provided Python code
        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }
        
        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}
```

Note:
- Java requires type declaration, so separate variables for `a`, `b`, and `c` with type `int` are declared.
- Unlike Python, Java does not have tuples, so assignment like `a, b, c` is not possible. Each variable must be assigned individually.
- Java uses `System.out.println` to print to the console.
- Java code should be encapsulated in a class and method. Here, I have encapsulated the code within the `main` method of a `Main` class.
