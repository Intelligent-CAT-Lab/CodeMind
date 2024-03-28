<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
50 100 120

Expected output:
Ye7s

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

class ATwoCoins:
    def solve(self, testNumber, in_stream, out_stream):
        a, b, c = map(int, in_stream.readline().split())
        out_stream.write("Yes" if a + b >= c else "No")

if __name__ == "__main__":
    solver = ATwoCoins()
    solver.solve(1, sys.stdin, sys.stdout)
```

In this Python code, we define a class `ATwoCoins` with a method `solve` that takes the test number, an input stream (`in_stream`), and an output stream (`out_stream`). Inside the `solve` method, we read the three integers from the input stream, add them together, and then write the result to the output stream. If the sum is greater than or equal to `c`, we write "Yes"; otherwise, we write "No".

We then create an instance of `ATwoCoins`, call its `solve` method with `1` as the test number, `sys.stdin` as the input stream, and `sys.stdout` as the output stream.<｜end▁of▁sentence｜>
