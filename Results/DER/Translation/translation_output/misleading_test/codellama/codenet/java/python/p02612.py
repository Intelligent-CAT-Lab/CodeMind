<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1900

Expected output:
186

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author shivam
 */
public class p02612 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int x = n / 1000;
            int y = n % 1000;
            if (y == 0) out.println(0);
            else {
                int ans = 1000 * (x + 1) - n;
                out.println(ans);
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


```
[/INST]
```python
import sys

def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        return 0
    else:
        return 1000 * (x + 1) - n

if __name__ == '__main__':
    n = int(sys.stdin.readline().strip())
    print(solve(n))
```
This is the Python code for the given Java code. The code first imports the `sys` module, which is used to read input from the standard input stream. The `solve` function takes an integer `n` as input and returns the minimum number of coins needed to make change for `n` cents. The function first calculates the number of coins needed for the first 1000 cents, which is `n // 1000`. It then calculates the number of cents left over, which is `n % 1000`. If the number of cents left over is 0, then the minimum number of coins needed is 0. Otherwise, the minimum number of coins needed is 1000 times the number of coins needed for the first 1000 cents plus the number of cents left over. The function returns the minimum number of coins needed.

The `if __name__ == '__main__':` block is used to run the code only when the file is executed as a script. It reads an integer `n` from the standard input stream using the `sys.stdin.readline().strip()` method, and then prints the result of the `solve` function using the `print` function.</s>
