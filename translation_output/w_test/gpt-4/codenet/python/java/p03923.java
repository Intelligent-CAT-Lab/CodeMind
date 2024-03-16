Below is the translated Java code that corresponds to the provided Python code.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            int t = n;
            for (int k = 1; k < ceil(log2(n)); k++) {
                int d = (int) ceil(Math.pow(n, 1.0 / k));
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double log2(int n) {
        return Math.log(n) / Math.log(2);
    }

    private static double ceil(double value) {
        return Math.ceil(value);
    }
}
```

This Java code uses `BufferedReader` and `StringTokenizer` for input parsing, similar to how `sys.stdin` is used in the Python version. The code takes input from the console and prints the result to the standard output.

Note: Ensure that your Java class is named accordingly if you're running this code in a development environment that expects the class and the file name to be the same.
