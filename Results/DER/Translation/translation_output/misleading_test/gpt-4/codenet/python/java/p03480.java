Below is the translated Java code from the provided Python code snippet:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res = Math.min(res, Math.max(n - i - 1, i + 1));
            }
        }

        if (res == Integer.MAX_VALUE) {
            System.out.println(n);
        } else {
            System.out.println(res);
        }
    }
}
```

Please note that the Java code reads the input from `System.in` using `BufferedReader`. Also, it does not use recursion, heap operations, or accumulations since those were not utilized in the logic of the provided Python snippet. The constants `mod` and `inf` also have been translated directly to their respective values, with `inf` being replaced with `Integer.MAX_VALUE` (which is a placeholder for infinity within the bounds of integer values). The Python `input()` function is equivalent to `BufferedReader.readLine()` method in Java.
