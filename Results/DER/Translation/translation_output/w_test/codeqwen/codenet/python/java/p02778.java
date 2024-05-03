Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print('x');
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then prints out 'x' the same number of times as the length of the string.
