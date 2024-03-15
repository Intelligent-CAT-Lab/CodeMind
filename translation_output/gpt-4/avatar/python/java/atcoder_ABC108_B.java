Certainly! Below is how you might translate the Python code into Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the inputs and parsing them to integers
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        // Performing the arithmetic operations
        int a = x2 - x1;
        int b = y2 - y1;

        // Printing the results
        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
        
        scanner.close();
    }
}
```

Please note that Java requires a bit more boilerplate code than Python and explicit data type declarations. In this Java code, we also include the necessary `import` statement for the `Scanner` class which is used to read input, and we use `nextInt()` to parse integers. We wrap the logic in a `main` method of a `Main` class since Java is an object-oriented language and requires a class-based structure. Additionally, I've added a `System.out.println` to print out the result with the format similar to Python's `print` for the space-separated integers.
