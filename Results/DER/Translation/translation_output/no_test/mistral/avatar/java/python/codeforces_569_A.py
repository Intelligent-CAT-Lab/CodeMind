<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def main():
    input = sys.stdin
    output = sys.stdout
    solver = TaskA()
    solver.solve(1, input, output)
    output.close()

class TaskA:
    def solve(self, testNumber, input, output):
        t = int(input.readline())
        s = int(input.readline())
        q = int(input.readline())
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        output.write(str(sum) + '\n')

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def hasNext(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                return False
        return True

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nextLine(self):
        str = None
        try:
            str = self.reader.readline()
        except Exception as e:
            e.printStackTrace()
        return str

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLong(self):
        return long(self.next())

    def nextBigInteger(self):
        return BigInteger(self.next())

    def nextBigDecimal(self):
        return BigDecimal(self.next())
```</s>
