Here is the Java equivalent of your Python code:

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
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it is greater than or equal to 30, and prints "Yes" if it is, or "No" if it isn't. The `Scanner` class is used to read input from the user.
