Below is the translation of the given Python code into Java code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubstringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            System.exit(0);
        }

        boolean found = false;
        for (int i = 0; i <= S.length() - 3; i++) {
            Set<Character> charSet = new HashSet<>();

            for (int j = i; j < i + 3; j++) {
                charSet.add(S.charAt(j));
            }

            if (charSet.size() <= 2) {
                System.out.println((i + 1) + " " + (i + 3));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1 -1");
        }
    }
}
```

In the above Java code:

- We import `Scanner` for input just like `input()` in Python.
- We import `Set` and `HashSet` for creating a character set, which is equivalent to `set(s)` in Python.
- The use of `charAt` in Java is equivalent to indexing (`S[i]`) in Python.
- Instead of `len(S)`, we use `S.length()` in Java.
- The `range(len(S)-3)` in Python is converted to `0` to `S.length() - 3` in Java.
- We use `System.out.println` for printing in Java instead of `print` in Python.
- The `exit()` call in Python is equivalent to `System.exit(0)` in Java.
- Java uses braces `{}` to define the scope of loops and conditions instead of indentation in Python.
