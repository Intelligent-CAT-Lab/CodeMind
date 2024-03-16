<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys
import math

class codeforces_569_A:
    def solve(self, testNumber, inp, out):
        t = inp.nextInt()
        s = inp.nextInt()
        q = inp.nextInt()
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        out.write(str(sum))
        out.flush()

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None

    def hasNext(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = InputReader.StringTokenizer(self.stream.readline())
            except Exception:
                return False
        return True

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = InputReader.StringTokenizer(self.stream.readline())
            except Exception:
                raise StopIteration
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def write(self, s):
        self.stream.write(s)
        self.stream.flush()

    def flush(self):
        self.stream.flush()

if __name__ == "__main__":
    inputStream = sys.stdin
    outputStream = sys.stdout
    inp = InputReader(inputStream)
    out = OutputWriter(outputStream)
    solver = codeforces_569_A()
    solver.solve(1, inp, out)
    out.flush()
```
<|EOT|>
