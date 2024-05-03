Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
        scanner.close();
    }
}
```

This Java program does the same thing as your Python code. It reads two integers from the user, checks if the second integer is divisible by the first, and then prints the sum or difference accordingly. The `Scanner` class is used to read input from the user.
