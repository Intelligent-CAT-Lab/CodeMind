<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 20 15 17 5

Expected output:
N

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
```python
import sys

def solve(test_number, in, out):
    points = int(in.readline())
    t = int(in.readline())
    a = int(in.readline())
    b = int(in.readline())
    ta = int(in.readline())
    tb = int(in.readline())
    for i in range(t):
        for j in range(t):
            if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
                out.write("YES\n")
                return
    out.write("NO\n")

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    solve(1, in, out)
```</s>
