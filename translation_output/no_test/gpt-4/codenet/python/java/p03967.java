Here is the equivalent Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ret = 0;

        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p' ? 1 : 0);
        }

        System.out.println(ret);
    }
}
```

In this Java code:

- We use `Scanner` for input (equivalent to Python's `input()` function).
- We iterate over the string `s` using a for-loop and access each character with `charAt(i)`.
- The ternary operator `(condition ? value_if_true : value_if_false)` is used instead of the Python list `[0, 1]` indexing.
- In the end, `System.out.println(ret)` is used to print the result to the console, equivalent to Python's `print(ret)`.
