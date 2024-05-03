Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        String a = parts[0];
        String b = parts[1];
        String c = parts[2];
        System.out.println(a + (parts.length - 2) + c);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into three parts using the comma as a delimiter, and then prints the first part, the number of parts minus 2 (to exclude the first and last parts), and the last part.
