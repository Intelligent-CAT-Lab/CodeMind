<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100000 3125 2

Expected output:
-20

```
import java.io.*;
import java.util.*;
import java.math.*;

public class codeforces_569_A {
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
            int t = in.nextInt();
            int s = in.nextInt();
            int q = in.nextInt();
            long sum = 0;
            while (s < t) {
                s = s * q;
                sum++;
            }
            out.println(sum);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
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

        public String nextLine() {
            String str = null;
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

        public BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
```
[/INST]

Here is the Python code that solves the problem:
```python
import sys

def solve(t, s, q):
    sum = 0
    while s < t:
        s = s * q
        sum += 1
    return sum

if __name__ == "__main__":
    t, s, q = map(int, sys.stdin.readline().split())
    print(solve(t, s, q))
```
This code reads the input from stdin, splits it into three integers `t`, `s`, and `q`, and then calls the `solve` function to calculate the number of times `s` needs to be multiplied by `q` to reach `t`. The result is then printed to stdout.

Note that this code assumes that the input is a single line of text, with the three integers separated by spaces. If the input is in a different format, you may need to modify the code accordingly.</s>
