Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(s.substring(0, 4) + " " + s.substring(4));

        scanner.close();
    }
}
```

This Java code does the same thing as the Python code: It reads a line of input from the user and prints the first four characters, followed by a space, and then the rest of the string.
