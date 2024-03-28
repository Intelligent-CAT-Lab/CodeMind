To translate the given Python code snippet to Java, you'll need to handle input differently since Java takes input using `Scanner` or other similar classes. You'll also need to adjust the syntax for accessing characters in a string and the conditional statements. Below is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Read input

        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0)
                || (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }

        scanner.close();
    }
}
```

To use this code, you would execute the Java class containing the `main` method. Note that the name of the public class needs to match the name of the Java file (in this case, `Main.java`). When you run the program, it will wait for user input on the command line, and after you enter a string and press enter, it will display "First" or "Second" according to the logic in the original Python code.
