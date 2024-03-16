Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Reads input from user
        int ans = 0;
        int length = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length += 1;
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
Note that Java requires explicit type declarations, and string comparison is done using charAt for each character in the loop. We use `Math.max()` for finding the maximum value. Don't forget to close the `Scanner` object to prevent resource leaks.
