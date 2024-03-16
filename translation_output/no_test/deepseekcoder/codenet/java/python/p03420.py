<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author palayutm
 */
public class p03420 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), K = in.nextInt();
            long ans = 0;
            for (int i = K + 1; i <= n; i++) {
                for (int j = 0; j * i <= n; j++) {
                    if (i * (j + 1) - 1 <= n) {
                        ans += i - K;
                    } else {
                        ans += Math.max(i - K - (i * (j + 1) - 1 - n), 0);
                    }
                }
            }
            if (K == 0) ans -= n;
            out.println(ans);
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream out) {
            super(out);
        }

        public OutputWriter(Writer out) {
            super(out);
        }

        public void close() {
            super.close();
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
import math

class InputReader:
    def __init__(self, stream):
        self.reader = iter(stream.readline().split())

    def next(self):
        return next(self.reader)

    def next_int(self):
        return int(self.next())


class OutputWriter:
    def __init__(self, stream):
        self.writer = stream

    def print(self, *args):
        print(*args, file=self.writer)

    def close(self):
        self.writer.close()


class TaskD:
    def solve(self, test_number, in_reader, out_writer):
        n, K = in_reader.next_int(), in_reader.next_int()
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range(0, n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        out_writer.print(ans)


def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = OutputWriter(output_stream)
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()


if __name__ == "__main__":
    main()
```
<|EOT|>
