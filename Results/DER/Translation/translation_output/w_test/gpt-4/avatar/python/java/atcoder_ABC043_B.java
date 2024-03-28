Here's the given Python code translated into Java:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // Read input string
        StringBuilder myStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (c == 'B' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
            }
        }
        System.out.println(myStr.toString());
        scanner.close();
    }
}
```

You have to type the input exactly as per the Test input, i.e., without any space between the characters. The code above assumes 'B' is not spaced with extra whitespaces as in the provided Python code. If 'B' should be considered with spaces, let me know, and I will provide an adjusted Java version.

