Here's the code translation from Python to Java that corresponds to the given Python code. Please note that Java is a statically typed language, and you need to import the Scanner class to take input from the user:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        scanner.close();
    }
}
```

This Java program checks if the input integer is 1; if so, it prints 0, otherwise it prints 1. It includes a `main` method which is the entry point for a Java application. The scanner is used to read the integer from the user input and is subsequently closed to prevent resource leaks.
