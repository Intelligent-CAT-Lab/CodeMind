Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
        scanner.close();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it is less than 1000, and prints "ABC" if it is, or "ABD" if it isn't. The `Scanner` class is used to read input from the user.
