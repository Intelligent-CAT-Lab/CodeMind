Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, compares them, and prints out the appropriate message. The `Scanner` class is used to read input from the user, and the `close()` method is called to close the scanner after it's no longer needed.
