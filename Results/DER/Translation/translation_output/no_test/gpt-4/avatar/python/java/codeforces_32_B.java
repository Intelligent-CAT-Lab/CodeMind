Here's the equivalent Java code for the provided Python code. In Java, we need to use a `Scanner` for taking input from the user and making use of `StringBuilder` for string concatenation is more efficient than using string directly.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result.append('0');
            } else {
                i += 1;
                if (i < s.length() && s.charAt(i) == '.') {
                    result.append('1');
                } else {
                    result.append('2');
                }
            }
            i += 1;
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}
```

I've fixed a couple of issues from the original Python code:
1. There should not be spaces inside the square brackets `[]` when accessing a string character.
2. When checking for `s[i]` being a period `.`, you should not have spaces around the period.

In the Java version, I have taken these corrections into account, and I used `charAt()` to get characters at specific indices. Note that accessing characters in Java uses the `charAt` method and not the square brackets `[]` as in Python. The `Scanner` class is used for reading input from the user, and we use its `nextLine()` method to read a whole line of text. After building the result string, we print it out and close the `Scanner` to avoid resource leaks.
