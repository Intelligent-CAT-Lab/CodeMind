Below is the equivalent Java code for the provided Python script:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int readInt() throws IOException {
        if (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine().trim());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();

        long ans = Long.MAX_VALUE; // equivalent to 1000000000000L in Python code
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sum_N(i) + sum_N(N - i));
        }

        System.out.println(ans);
    }

    public static int sum_N(int number) {
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number = number / 10;
        }
        return total;
    }
}
```
In this Java version of the code:

- We use `BufferedReader` and `StringTokenizer` to read input from standard input, which is common in Java for faster input reading.
- `readInt()` function is created to handle reading integers from the input.
- The `sum_N` function logic remains the same but uses the standard division `/` operator instead of integer division `//`.
- `ans` is instantiated as `Long.MAX_VALUE` which is the Java equivalent of a very large long type number, and it serves the same purpose as `1000000000000L` in the Python code.
- The loop and the minimum comparison remain the same, with the syntax adapted to Java.
- The printed output uses `System.out.println` to write to the standard output.

Note that `Main` could be any other class name that reflects the context of your application.
