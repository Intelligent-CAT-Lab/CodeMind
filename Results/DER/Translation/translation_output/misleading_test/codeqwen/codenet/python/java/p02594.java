Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java program does the same thing as your Python program. It reads an integer from the user, checks if it is greater than or equal to 30, and prints "Yes" if it is, or "No" if it isn't.
