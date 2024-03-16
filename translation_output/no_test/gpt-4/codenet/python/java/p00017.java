Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            for (int i = 0; i < 'z' - 'a' + 1; i++) {
                if (s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s = decode(s);
            }
        }
        scanner.close();
    }

    private static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '.') {
                char shifted = (char) (c + 1);
                if (shifted == ('z' + 1)) {
                    shifted = 'a';
                }
                result.append(shifted);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
```

This Java code reads lines from the standard input (similar to `sys.stdin.readlines()` in Python) and processes each line. The `decode` function takes a string `s` and increments every character by one, wrapping around to 'a' if it goes past 'z', and leaves spaces and periods unchanged. The main loop looks for 'the', 'that', or 'this' in the string and prints out the original string if it finds any of those words, utilizing the `decode` method to iterate through all possible single-character shifts.
