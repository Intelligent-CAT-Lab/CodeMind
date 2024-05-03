Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String result = parts[0] + parts[1].charAt(0) + parts[2];
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into parts, and then concatenates the first part, the first character of the second part, and the third part to form the result. The result is then printed to the console.
