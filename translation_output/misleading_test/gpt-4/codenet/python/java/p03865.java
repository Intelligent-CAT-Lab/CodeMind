Below is the translated Java code for the Python snippet you provided. The code reads a string from the standard input, applies the same logic as the Python code to determine the outcome, and prints the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ans;

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 == 1) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2 == 1) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

To run this code, you should compile it with `javac Main.java` and then run the compiled bytecode with `java Main` in a command-line interface that supports Java. You can then input the test string, and it will output the expected result.
