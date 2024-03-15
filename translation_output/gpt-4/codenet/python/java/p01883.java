Below is the translated Java code. The original Python script uses some Python-specific libraries and functions, which I replaced with equivalent Java functionality. Also, Java doesn't provide a direct equivalent of Python's `bisect`, so I implemented a binary search manually.

Note that Java's I/O is different from Python's, and in Java, it's common practice to use a `Scanner` or a `BufferedReader` for input, and `System.out` for output. Methods such as `LI`, `LS`, etc., are replaced with Java's standard way to read input.

Here's the translation:

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    static final long inf = 1000000000000000000L;
    static final double eps = 1.0 / 10000000000.0;
    static final int mod = 1000000007;
    static final int[][] dd = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    static final int[][] ddn = {{-1,0}, {-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}, {-1,-1}};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine().trim());
        List<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++) {
            a.add(a.get(a.size() - 1) + i);
        }

        int t = Collections.binarySearch(a, n);
        if (t < 0) {
            t = -(t + 1);
        }

        int[] r = new int[2 * t];
        Arrays.fill(r, 0, t, 1);

        for (int i = 0; i < t; i++) {
            int ai = a.get(t - i);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                int temp = r[ti];
                r[ti] = r[ti - ts];
                r[ti - ts] = temp;
                n -= t - ts;
            } else {
                break;
            }
        }

        out.print(getStringRepresentation(r));
        out.flush();
    }

    static String getStringRepresentation(int[] r) {
        StringBuilder sb = new StringBuilder();
        for (int value : r) {
            sb.append(value == 1 ? "(" : ")");
        }
        return sb.toString();
    }
}
```

This Java program should provide the same functional output as the given Python script when run with the same input. Remember, due to the difference between Python and Java in handling large numbers with arbitrary precision, there might be cases where Python's implicit handling of big numbers could differ from Java's handling using primitives.

Remember to call the `main` method of the `Main` class when you want to execute the program. This can be done by simply running the Java program from the command-line interface or through an IDE that runs Java applications.
