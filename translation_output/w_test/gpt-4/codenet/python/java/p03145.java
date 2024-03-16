Here's the translation of your Python code to Java:

```java
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        System.out.println((a * b) / 2);
    }
}
```

Note that I have omitted some imports and functions from your original Python code because they were not used in computing the result. In Java, the `BufferedReader` and `StringTokenizer` classes are commonly used to read and parse input, providing similar functionality to Python's `input()` and `split()` for basic usage.

Furthermore, I did not translate the `gcd` function from the `fractions` module because it was not used in the program. If necessary, you may want to include your own implementation of `gcd` in Java, which I have provided in the code. Please ensure you're running the Java code in an appropriate environment where standard input is available and handled correctly.
