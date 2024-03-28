Here's the equivalent Java code for the provided Python script. The code reads an input string (similar to the `input()` function in Python), calculates the result, and prints it to the console.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.lang.Math;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        // No need to set recursion limit or create other Python-specific constructs.

        String s = nextLine();
        int n = s.length();
        int res = Integer.MAX_VALUE; // Java equivalent of Python's inf.
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

    // Helper function to read the next line.
    private static String nextLine() throws IOException {
        return br.readLine();
    }

    // Helper function to read the next integer. Not used in this program but often useful.
    private static int nextInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
```

You can compile and run this Java program, pass the test input "010" to the console, and you should expect to receive the output "2". Note that in a full development environment, you would also want to include proper error handling, and possibly a more structured approach for handling input and output.
