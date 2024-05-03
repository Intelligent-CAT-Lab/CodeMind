Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = " Yes " if (s.contains("A") && s.contains("B")) ? " Yes " : " No ";
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, checks if the string contains both "A" and "B", and prints " Yes " if it does, and " No " if it doesn't.
