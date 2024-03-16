Below is the equivalent Java code for the provided Python script:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int a = Integer.parseInt(tokenizer.nextToken());
    
        int t = n;
        for (int k = 1; k < ceil(log2(n)); k++) {
            int d = (int) Math.ceil(Math.pow(n, 1.0 / k));
            int l = 0;
            int r = k;
            while (l + 1 < r) {
                int c = (l + r) / 2;
                if (n <= Math.pow(d - 1, k - c) * Math.pow(d, c)) {
                    r = c;
                } else {
                    l = c;
                }
            }
            t = Math.min(t, (d - 1) * (k - r) + d * r + (k - 1) * a);
        }
        System.out.println(t);
    }

    private static double log2(int n) {
        return Math.log(n) / Math.log(2);
    }

    private static double ceil(double value) {
        return Math.ceil(value);
    }
}
```

Make sure that your system is set up to compile and run Java programs and that the Java Development Kit (JDK) is installed. Also, note that the Java equivalent for iterating until `ceil(log2(n))` was replaced by a while loop in Python's code snippet. In Java, we don't need the `ceil` method in the loop condition since `k` is already an integer and will not reach the non-integer ceiling value.

Additionally, in Java, we don't usually access the standard input stream directly. Instead, we use a `BufferedReader` with an `InputStreamReader`, as well as a `StringTokenizer` or `Scanner` to read and parse the input data. The java.io package contains all the necessary classes for input and output (I/O).
