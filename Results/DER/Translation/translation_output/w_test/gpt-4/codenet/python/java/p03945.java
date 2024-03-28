Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') ||
                (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W')) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
```

This Java code will behave similarly to the Python code you provided for the given test input. It uses a Scanner to read the input string, iterates over the string to find consecutive 'WB' or 'BW' pairs, and counts them. Finally, it prints the count to the standard output.
