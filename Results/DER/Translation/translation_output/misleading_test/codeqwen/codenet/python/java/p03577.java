Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, input.length() - 8));
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, then prints out the first 8 characters of that line. The `substring` method in Java is similar to Python's slicing syntax, but it uses 0-based indexing.
