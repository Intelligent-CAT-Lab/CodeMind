Here is the translated Java code based on the Python code you provided. Please take note that in Java, we don't have a direct equivalent of Python's `exit()` and that Java uses different methods for string comparison and substring extraction.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.length() < 5) {
            System.out.println("NO");
            System.exit(0);
        } else {
            int i = 0;
            while (true) {
                if ((i + 5 == S.length() && S.substring(i, i + 5).equals("dream")) ||
                    (i + 5 == S.length() && S.substring(i, i + 5).equals("erase")) ||
                    (i + 6 == S.length() && S.substring(i, i + 6).equals("eraser")) ||
                    (i + 7 == S.length() && S.substring(i, i + 7).equals("dreamer"))) {
                    System.out.println("YES");
                    System.exit(0);
                } else if (S.startsWith("dream", i) && i + 8 <= S.length()) {
                    if (S.startsWith("erd", i + 5) || S.startsWith("ere", i + 5)) i += 7;
                    else if (S.startsWith("era", i + 5) || S.startsWith("d", i + 5)) i += 5;
                    else {
                        System.out.println("NO");
                        System.exit(0);
                    }
                } else if (S.startsWith("erase", i) && i + 7 <= S.length()) {
                    if (S.startsWith("e", i + 5) || S.startsWith("d", i + 5)) i += 5;
                    else if (S.startsWith("r", i + 5)) i += 6;
                    else {
                        System.out.println("NO");
                        System.exit(0);
                    }
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
    }
}
```

Please notice the following changes:

1. Instead of calling an `input()` function, we create an instance of `Scanner` to read from standard input.
2. We replaced `len(S)` with `S.length()`, which is the Java syntax for getting the length of a string.
3. Instead of using Python's slice syntax like `S[i:i+5]`, we use `S.substring(i, i+5)` in Java to extract a substring.
4. We replaced string comparisons using `==` with `equals` or `startsWith` methods because `==` in Java compares object references rather than the content of the strings.
5. We used `System.exit(0)` to terminate the program; the argument `0` typically indicates a successful termination.
6. Java code needs to be encapsulated within a class, in this case, I named it `Main`.

Please remember to wrap the Java code in a file with the `.java` extension and compile it before running.
