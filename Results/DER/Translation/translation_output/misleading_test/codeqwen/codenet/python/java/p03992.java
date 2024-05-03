Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
```

This Java code does the same thing as the Python code: it reads a string from the user, then prints the first four characters of the string, followed by a space, followed by the remaining characters of the string.
