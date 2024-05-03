Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, replaces all commas with spaces, and then prints the resulting string.
