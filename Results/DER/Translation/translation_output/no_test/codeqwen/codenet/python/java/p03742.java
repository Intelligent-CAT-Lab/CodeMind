Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        String result = Math.abs(a - b) > 1 ? "Alice" : "Brown";
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the absolute difference between them, and then prints "Alice" if the difference is greater than 1, or "Brown" otherwise.
