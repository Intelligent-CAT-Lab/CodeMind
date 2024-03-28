Below is the translated version of the provided Python code into Java:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int INF = Integer.MAX_VALUE;
    static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        String s = next();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(tmp + "")) {
                    System.out.println(s + tmp);
                    return; // instead of exit() in Python, use return to exit the program
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (char j = (char) (s.charAt(i) + 1); j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(j + "")) {
                        System.out.println(s.substring(0, i) + j);
                        return; // instead of exit() in Python, use return to exit the program
                    }
                }
            }
            System.out.println(-1);
            return; // instead of exit() in Python, use return to exit the program
        }
    }
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    // Other functions for MAP, S_MAP, LIST, S_LIST can be implemented similarly.
}
```

Please note the following when translating Python to Java:

1. Python has built-in functions for reading input, while in Java, you often use `BufferedReader` and `StringTokenizer` to read and parse the input efficiently.
2. Java requires type declaration for variables, so the inferred types in Python need to be explicitly declared when translating to Java.
3. Java uses the `return` statement to exit a function. In the context of a `main` method, using `return` will end the program, which is the Java equivalent of `exit()` in Python.
4. Java's `System.out.println` is used to output to the console, similar to `print` in Python.
5. In the case of the translated code above, I have combined the input reading methods into a utility function `next()`, similar to the Python `input()` function. You will need to implement other helper functions (`MAP`, `S_MAP`, `LIST`, `S_LIST`) similarly if you need them.
