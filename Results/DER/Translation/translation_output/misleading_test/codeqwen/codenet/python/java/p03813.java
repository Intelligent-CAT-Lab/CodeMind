Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```

This Java program does the same thing as your Python code. It reads an integer from the user, checks if it is less than 1200, and prints "ABC" if it is, or "ARC" if it isn't.
