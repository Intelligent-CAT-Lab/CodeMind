Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) ||
            (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
```

To use this class, compile it with `javac Main.java` and then run it with `java Main`, entering the test input when prompted.

Please note that Java requires explicit object creation for `Scanner` to read from standard input, and method calls (`charAt()` and `length()`) instead of square brackets for accessing characters and string length, respectively. Java uses `System.out.println()` to print to the standard output.
