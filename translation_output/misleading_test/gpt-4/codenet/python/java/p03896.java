Translating that Python code to Java involves a few significant changes due to differences between the two languages. Let's go through the translation step by step.

Firstly, Python's `input()` is typically replaced by a `Scanner` in Java. Secondly, Python's `range` will be translated to a regular for-loop, and the Pythonic list comprehension and string join operation will be replaced by a StringBuilder or similar approach. Finally, the Python code uses bitwise operations and the special back-tick notation for representing numbers as strings which is not present in Java; we'll use string concatenation instead.

Here is the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        
        for (int i = 0; i < n - 2 / n; i++) {
            boolean first = true;
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n - 1; j++) {
                if (!first) {
                    line.append(" ");
                } else {
                    first = false;
                }
                int value = (i - ~(j ^ (n % 2 < (j + 2 < n ? i * 2 : 0)))) % n + 1;
                line.append(Integer.toString(value));
            }
            System.out.println(line.toString());
        }
    }
}
```

Please note that there might be a logical error or a misinterpretation from the original Python code to the translated Java code due to the density and obscurity of the Python one-liner. This translation assumes that the bitwise operations and the negativity condition hold the same intention when translated directly, which might not be the case if there's a deeper context or a specific algorithm at play that is not apparent from the snippet provided.
