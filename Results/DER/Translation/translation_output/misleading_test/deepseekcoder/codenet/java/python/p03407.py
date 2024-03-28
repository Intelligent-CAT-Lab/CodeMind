<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve(inp):
    a, b, c = map(int, inp.split())
    return "Yes" if a + b >= c else "No"

if __name__ == "__main__":
    print(solve(sys.stdin.readline().strip()))
```

In this Python code, we define a function `solve` that takes a string of space-separated integers as input. This string is split into individual integers using the `split` function, which returns a list of strings. These strings are then converted to integers using the `map` function. The sum of the first two integers is compared to the third integer. If the sum is greater than or equal to the third integer, the function returns "Yes"; otherwise, it returns "No". The `solve` function is then called with the contents of `sys.stdin.readline().strip()` as the argument, which reads a line from the standard input and removes any leading or trailing whitespace. The result is printed to the standard output.
<|EOT|>
