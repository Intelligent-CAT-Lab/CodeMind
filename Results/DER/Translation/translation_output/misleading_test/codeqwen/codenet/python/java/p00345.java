Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String all = "";
        String sub = "";
        int p = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                int o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else if (S.charAt(i) != ')') {
                all += S.charAt(i);
            }
        }

        int d = S.length() - p - 1;
        int l = p - d - 1;
        if (p == -1) {
            System.out.println(all + "/" + 10 * d);
        } else {
            d -= 2; // for ()
            System.out.println((all.substring(0, all.length() - sub.length())) + "/" + (10 * d - 10 * l));
        }
    }
}
```

Please note that the Java version of your code is a bit different from the Python version. The main differences are:

1. Java doesn't have a built-in gcd function, so I've implemented it manually.
2. Java doesn't have a built-in printV function, so I've implemented it manually.
3. Java uses the `Scanner` class to read input from the user, instead of `input()`.
4. Java uses `charAt(i)` to get the character at index `i` in a string, instead of `S[i]`.
5. Java uses `substring(start, end)` to get a substring from index `start` to index `end` in a string, instead of `all[o:p]`.
6. Java uses `System.out.println()` to print to the console, instead of `print()`.
