Here is the Java translation for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        int a = 0;
        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == 'A') {
                a += 1;
                i += 1;
            } else if (i + 1 < S.length() && S.charAt(i) == 'B' && S.charAt(i + 1) == 'C') {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i += 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
```

Some of the key differences from Python to Java are as follows:

- We use a `Scanner` object to read input from the standard input in Java.
- Java does not have the `input()` function like Python; instead, we must explicitly ask for the next token from the `Scanner`.
- In Java, string indexing and substring extraction is done with `charAt()` and `substring()` methods, not with square brackets like in Python.
- Java enforces the use of semi-colons at the end of each statement.
- Index checking for substring is required to prevent `StringIndexOutOfBoundsException`. In the Python code, slicing does not raise an error for out-of-bound indices, but in Java we need to verify the index is within bounds before using `charAt()` function.
- `System.out.println()` is used to print the output instead of `print()`.
- A `main` method is defined to hold the program code, and the code logic should be contained within either the `main` method or other static or instance methods called from `main`.
- The `Scanner` should be closed after use to prevent potential leaks using `sc.close()`.

The above translation assumes that the objective is to mimic the functionality of the Python code in Java. The Java code is written to be contained in a `Main` class as required by Java's OOP constructs.
