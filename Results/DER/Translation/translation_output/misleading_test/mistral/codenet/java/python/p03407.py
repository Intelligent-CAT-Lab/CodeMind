<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def solve(test_number, in, out):
    out.write(str(in.readline().strip().split()[0]) + in.readline().strip().split()[1] >= in.readline().strip().split()[2]) + "\n")

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    solve(1, in, out)
```</s>
