<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        return 0
    else:
        return 1000 * (x + 1) - n

def main():
    n = int(sys.stdin.readline())
    print(solve(n))

if __name__ == "__main__":
    main()
```

In this Python code, we define a function `solve` that takes an integer `n` as input and returns the desired output. The `main` function reads the input from the standard input, calls `solve` with the input, and prints the result. The `if __name__ == "__main__":` line ensures that `main` is called when the script is run directly, but not when it's imported as a module.
<|EOT|>
