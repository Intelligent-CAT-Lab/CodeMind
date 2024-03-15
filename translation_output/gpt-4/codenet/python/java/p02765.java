Here's how you can translate the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        // Condition and output
        if (n < 10) {
            int result = r + 100 * (10 - n);
            System.out.println(result);
        } else {
            System.out.println(r);
        }

        // Close the scanner
        scanner.close(); 
    }
}
```

This Java program does the same thing as the Python code -- it reads two integers `n` and `r` from the input, checks if `n` is less than 10 and, if so, adds `100 * (10 - n)` to `r` and prints the result. If `n` is 10 or greater, it simply prints `r`. Make sure that the input numbers are provided in the same way as in Python (separated by a space) when you run the Java program.
