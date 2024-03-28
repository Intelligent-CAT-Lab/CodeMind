Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close(); // Close the scanner to avoid resource leaks

        char[] s = input.toCharArray();
        char[] t = new StringBuilder(input).reverse().toString().toCharArray();

        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            }
            if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }

        boolean isEqual = true;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) {
                isEqual = false;
                break;
            }
        }

        String ans = isEqual ? "Yes" : "No";
        System.out.println(ans);
    }
}
```

A few notes about the translation:
- We use a `Scanner` for input in Java.
- In Java, strings are immutable, so for reverse and manipulation, we convert the string to a character array or use `StringBuilder` as shown above.
- Instead of Python's `list` function, Java uses `toCharArray` to convert a `String` to a `char` array.
- The reverse operation is done using `StringBuilder` in Java.
- We use a for-loop to iterate over the character array, similar to the Python code.
- In Java, we check for array equality using iterating through each element since there's no direct equivalent to Python's `s == t` for arrays.
