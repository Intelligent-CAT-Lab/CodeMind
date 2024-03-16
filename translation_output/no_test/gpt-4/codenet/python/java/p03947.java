Here's the translation of the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ans += 1;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

This Java code will perform the same functionality as the Python code. It reads a string from the standard input, iterates through each character of the string (except the last one), compares it with the next character, increments a counter if they are not equal, and finally, prints the result.
