Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, performs the same calculations as the Python code, and prints the result. The `Scanner` class is used to read the input from the user. The `close()` method is called on the `Scanner` object to close the input stream.
