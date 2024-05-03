Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String a = parts[0];
        String b = new StringBuilder(parts[1]).reverse().toString();
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(sum);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into two parts, reverses the second part, converts both parts to integers, adds them together, and prints the result.
