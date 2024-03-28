Below is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.print(new String(new char[a]).replace("\0", "0"));
                System.out.println(new String(new char[w - a]).replace("\0", "1"));
            } else {
                System.out.print(new String(new char[a]).replace("\0", "1"));
                System.out.println(new String(new char[w - a]).replace("\0", "0"));
            }
        }

        scanner.close();
    }
}
```

Please note that in Java, strings are immutable, and there is no direct equivalent to Python's `str.join()` for arrays of characters. Instead, you create a new string of the required length initialized with a single character, which is accomplished by `new String(new char[n]).replace("\0", "x")`, where `n` is the number of times the character `x` should appear in the string. Another approach is to use a `StringBuilder` to append characters in a loop, but the above example provides a direct translation that is similar in spirit to the original Python code.
