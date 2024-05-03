Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = new StringBuilder(input[1]).reverse().toString();
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
```

This Java code does the same thing as your Python code. It reads two numbers from the user, reverses the second number, and then adds them together. The result is printed to the console.
