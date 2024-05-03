Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() == 2) {
            System.out.println(input);
        } else {
            System.out.println(new StringBuilder(input).reverse().toString());
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, checks if the length of the input is 2, and if so, prints the input. If the length of the input is not 2, it reverses the input using the `StringBuilder` class and prints the reversed input.
