Here's the equivalent Java code that provides the same functionality as the Python code you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.equals("ani") ? "square1001" : "e869120");
        scanner.close();
    }
}
```

Explanation:

1. Import the `Scanner` class to handle user input.
2. Define the class `Main`.
3. Inside the `main` method, create a `Scanner` object to read from the standard input.
4. Read a line of input from the user.
5. Use the ternary operator (`? :`) to check if the input is equal to the string "ani"; if true, print "square1001"; otherwise, print "e869120".
6. Close the scanner to avoid resource leaks.
