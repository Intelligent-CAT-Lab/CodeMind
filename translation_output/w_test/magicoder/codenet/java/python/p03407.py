<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
50 100 120

Expected output:
Yes


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03407 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATwoCoins solver = new ATwoCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoCoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            out.println(in.nextInt() + in.nextInt() >= in.nextInt() ? "Yes" : "No");
        }

    }
}


```

@@ Response
```python
import sys

def solve(testNumber, in_stream, out_stream):
    a, b, c = map(int, in_stream.readline().split())
    out_stream.write("Yes" if a + b >= c else "No")

if __name__ == "__main__":
    solve(1, sys.stdin, sys.stdout)
```

In this Python code, we use the `sys` module to read from the standard input (`sys.stdin`) and write to the standard output (`sys.stdout`). The `solve` function reads three integers from the input stream, calculates their sum, and writes "Yes" to the output stream if the sum is greater than or equal to `c`, otherwise it writes "No".<｜end▁of▁sentence｜>
