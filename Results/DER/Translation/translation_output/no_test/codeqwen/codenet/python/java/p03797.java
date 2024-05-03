Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int s = Integer.parseInt(inputs[0]);
        int c = Integer.parseInt(inputs[1]);

        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, performs the same calculations as your Python code, and prints the result.
