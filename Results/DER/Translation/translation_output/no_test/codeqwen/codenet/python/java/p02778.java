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

This Java code does the same thing as your Python code. It reads a line of input from the user, then prints out a string of 'x' characters the same length as the input string.
