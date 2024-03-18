Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ans = 0;
        int length = 0;
        String s = scanner.next();

        for (char c : s.toCharArray()) {
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program reads input from the standard input, processes the string in the same way as the given Python code, and prints the maximum length of consecutive characters 'A', 'C', 'G' or 'T' to the standard output.
