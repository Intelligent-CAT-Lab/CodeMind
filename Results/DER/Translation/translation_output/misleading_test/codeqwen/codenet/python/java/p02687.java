Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, checks if it's equal to "ARC", and prints "ABC" if it is, or "ARC" if it's not. The `Scanner` class is used to read input from the user, and the `equals` method is used to compare strings in Java.
