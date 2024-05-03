Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.replace(",", " "));
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, replaces all commas with spaces, and then prints the result.
