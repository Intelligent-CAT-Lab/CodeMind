Here's the translated Java code for the provided Python script:

```java
import java.util.*;
import java.io.*;

public class Main {
    static int[] a = new int[50000];
    static {
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }
    }

    public static int findIndex(int n) {
        int index = Arrays.binarySearch(a, n);
        if (index < 0) {
            index = -index - 1;
        }
        return index;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();

        int t = findIndex(n);
        result.append(String.join("", Collections.nCopies(t, "(")));
        result.append(String.join("", Collections.nCopies(t, ")")));
        char[] r = result.toString().toCharArray();

        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                char temp = r[ti];
                r[ti] = r[ti - ts];
                r[ti - ts] = temp;
                n -= t - ts;
            } else {
                break;
            }
        }

        System.out.println(new String(r));
    }
}
```

To match the expected test case of reading an integer from stdin and outputting the result, I placed it within a `main` method which uses `BufferedReader` to read an integer from standard input. You can use this code as a starting point, and adjust as necessary for your application. Remember that this is a direct translation, but some elements (like the way Python handles `input()` and `print()`, or the `bisect` module functionality) don't have direct equivalents in Java and thus require a manual implementation.
