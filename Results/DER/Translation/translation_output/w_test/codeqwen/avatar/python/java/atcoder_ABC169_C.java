Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        long a = Long.parseLong(parts[0]);
        double b = Double.parseDouble(parts[1]);
        b = b * 100;
        long result = (long) (a * b);
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into two parts, converts the first part to a long integer, and the second part to a double. It then multiplies the two numbers together, multiplies the result by 100, and prints the result.
