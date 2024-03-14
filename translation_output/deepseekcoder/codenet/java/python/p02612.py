<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.reader = input_stream

    def next(self):
        return self.reader.readline().strip()

    def next_int(self):
        return int(self.next())

class TaskA:
    def solve(self, inp, outp):
        n = inp.next_int()
        x = n // 1000
        y = n % 1000
        if y == 0:
            outp.write(str(0))
        else:
            ans = 1000 * (x + 1) - n
            outp.write(str(ans))
        outp.write("\n")
        outp.flush()

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    outp = output_stream
    solver = TaskA()
    solver.solve(inp, outp)

if __name__ == "__main__":
    main()
```
<|EOT|>
