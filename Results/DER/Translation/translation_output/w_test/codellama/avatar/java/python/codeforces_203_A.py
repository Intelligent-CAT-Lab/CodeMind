<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 20 15 17 5

Expected output:
NO


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

public class codeforces_203_A {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATwoProblems solver = new ATwoProblems();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoProblems {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int points = in.nextInt();
            int t = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int ta = in.nextInt();
            int tb = in.nextInt();
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < t; j++) {
                    if (points == a - i * ta + b - j * tb || (points == 0) || points == a - ta * i || points == b - tb * j) {
                        out.println("YES");
                        return;
                    }
                }
            }
            out.println("NO");
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

Here is the Python code that translates the Java code:
```python
import sys

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = self.reader.readline()
            except IOError as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class ATwoProblems:
    def solve(self, test_number, in, out):
        points = in.nextInt()
        t = in.nextInt()
        a = in.nextInt()
        b = in.nextInt()
        ta = in.nextInt()
        tb = in.nextInt()
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                    out.write("YES\n")
                    return
        out.write("NO\n")

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = InputReader(input_stream)
    out = PrintWriter(output_stream)
    solver = ATwoProblems()
    solver.solve(1, in, out)
    out.close()
```
Note that the `InputReader` class is not necessary in Python, as the `sys.stdin` object can be used to read input from the console. The `PrintWriter` class is also not necessary, as the `sys.stdout` object can be used to write output to the console.</s>
