<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def solve(test_number, in_, out):
    a, b, c = map(int, in_.readline().split())
    if a + b >= c:
        out.write("Yes\n")
    else:
        out.write("No\n")

if __name__ == '__main__':
    solve(1, sys.stdin, sys.stdout)
```
Note: The `solve` function takes the test number, the input stream, and the output stream as arguments. It reads the input from the input stream using the `readline` method and splits it into three integers using the `split` method. It then checks if the sum of the first two integers is greater than or equal to the third integer, and writes "Yes" or "No" to the output stream using the `write` method. The `if __name__ == '__main__':` block is used to call the `solve` function with the test number, the input stream, and the output stream as arguments.</s>
