Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        int ans = 0;
        int memo = 0;

        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    // pass is not needed in Java, because Java does nothing if there is an empty block of code.
                } else {
                    memo -= 1;
                }
            } else {
                memo += 1;
            }
        }
        
        System.out.println(memo * 2);
        scanner.close();
    }
}
```

Several notes on the differences between the Python and Java code:

1. In Java, we must first import the Scanner class to read input from the console.
2. Java is a statically typed language, so we declare the type of each variable.
3. The `input()` function in Python is replaced with `scanner.nextLine()` using the Scanner object.
4. Python uses indentation to define blocks of code. In Java, we use curly brackets `{ }`.
5. Java uses `System.out.println` to print output to the console, and it prints the `int` as is, no need for conversion.
6. Since strings are not iterable in the same way in Java as in Python, we use `X.length()` in the for loop and `X.charAt(i)` to get a character from the string.
7. Instead of using `pass` (which is a Python-specific statement), we simply omit any code in the block where `pass` would have been used.
8. After we're done with a Scanner object, it's a good practice to close it with `scanner.close()` to release system resources.
