Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        System.out.println(A + B);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into two parts, converts those parts to integers, and then prints the sum of those integers.
