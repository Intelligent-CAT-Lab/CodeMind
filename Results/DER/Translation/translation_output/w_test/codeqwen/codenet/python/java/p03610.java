Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, s.length() / 2));
    }
}
```

This Java code does the same thing as the Python code: it reads a string from the user, and then prints out every second character of the string. The `substring(0, s.length() / 2)` method call does the same thing as `s[::2]` in Python: it creates a new string that starts at the beginning of the original string and ends at the middle of the original string.
