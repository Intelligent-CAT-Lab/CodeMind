<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

def solve(n, in, out):
    x = n // 1000
    y = n % 1000
    if y == 0:
        out.write("0\n")
    else:
        ans = 1000 * (x + 1) - n
        out.write(str(ans) + "\n")

def main():
    in = sys.stdin
    out = sys.stdout
    solver = TaskA()
    solver.solve(1, in, out)

class TaskA:
    def solve(self, testNumber, in, out):
        n = in.readline().strip()
        solve(int(n), in, out)

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except:
                raise RuntimeError()
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

if __name__ == "__main__":
    main()
```</s>
