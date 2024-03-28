<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve(inp):
    a, b, c = map(int, inp.split())
    return "Yes" if a + b >= c else "No"

if __name__ == "__main__":
    print(solve(sys.stdin.readline().strip()))
```

In this Python code, we read the input from the standard input (sys.stdin.readline().strip()), split it into three integers (a, b, c), and then check if the sum of a and b is greater than or equal to c. If it is, we return "Yes"; otherwise, we return "No".
<|EOT|>
