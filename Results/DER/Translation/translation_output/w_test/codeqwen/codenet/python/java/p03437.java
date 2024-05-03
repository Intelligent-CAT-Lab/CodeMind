Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x % y == 0 ? x : -1);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if the first integer is divisible by the second, and prints the first integer if it is, or -1 if it isn't.
