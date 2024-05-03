Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code: it reads a line of input from the user, checks if the string contains the character '9', and prints 'Yes' or 'No' accordingly. The `Scanner` class is used to read input from the user, and the `contains` method is used to check if the string contains the specified character. The `close` method is called to close the `Scanner` object to release system resources.
