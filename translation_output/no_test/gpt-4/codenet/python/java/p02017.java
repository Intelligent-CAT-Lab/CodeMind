Here is the equivalent Java code for the given Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        if (((H * W) * (X + Y)) % 2 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        scanner.close();
    }
}
```

This Java code does the following:

- It imports the `Scanner` class to take input from the user.
- It defines a `Main` class with a `main` method, which is the entry point of a Java application.
- It creates a `Scanner` object to read the inputs (`H`, `W`, `X`, `Y`) from the standard input (typically the keyboard).
- It then calculates the same expression `((H * W) * (X + Y)) % 2` and checks if the result is not zero to print "No". Otherwise, it prints "Yes".
- It closes the `Scanner` object to prevent resource leaks, which is considered good practice when using a `Scanner` in Java.
