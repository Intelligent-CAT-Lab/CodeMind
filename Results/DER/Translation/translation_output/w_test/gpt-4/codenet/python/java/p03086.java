Here's the translated Java code for the given Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        int length = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
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

When you provide the test input "ATCODER" to this Java program, the expected output will be `3`, as it calculates the longest sequence of characters 'A', 'C', 'G', and 'T' in the input string.
