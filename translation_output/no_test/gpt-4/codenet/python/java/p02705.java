To translate the Python code into Java, you would need to utilize a `Scanner` object to capture user input from the console. Here's the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        double result = userInput * 6.28;
        System.out.println(result);
        scanner.close();
    }
}
```

This Java code does the following:

1. Imports the `Scanner` class, which allows us to read user input.
2. Defines the `Main` class.
3. Includes the `main` method, the entry point of a Java program.
4. Inside the `main` method, it creates a new `Scanner` object to read from `System.in`.
5. Reads an integer from the user with `scanner.nextInt()`.
6. Multiplies the user input by 6.28 and stores the result in a `double` variable.
7. Prints out the calculated `result`.
8. Finally, it closes the `Scanner` object to prevent resource leaks.
