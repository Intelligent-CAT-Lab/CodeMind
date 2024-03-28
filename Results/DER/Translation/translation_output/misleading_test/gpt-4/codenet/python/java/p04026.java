Here's the equivalent Java code for the provided Python script. The Java code reads an input string from the console, processes it in a similar way as the Python code, and outputs the indices if it finds consecutive or one-character-apart matching characters. If no such pairs are found, it prints "-1 -1".

```java
import java.util.Scanner;

public class StringPatternFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Reads a string from the console

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println((i + 1) + " " + (i + 2));
                System.exit(0); // Exiting the program
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println((i + 1) + " " + (i + 3));
                System.exit(0); // Exiting the program
            }
        }
        System.out.println("-1 -1");
    }
}
```

To run the above Java code, you would need to compile it first using a Java compiler, then run the compiled bytecode with a Java Runtime Environment. Assuming you named the file `StringPatternFinder.java`, you would use the following commands on a command line:

```shell
javac StringPatternFinder.java
java StringPatternFinder
```

Upon execution, it will wait for you to input a string, after which it will process this string according to the logic ported from the Python script and output the corresponding values.

Keep in mind that the `exit()` call in Python terminates the application, which in Java needs to be translated to `System.exit(0)`. It's especially important to include this call since if not, Java will keep executing the rest of the code even after finding a match.
