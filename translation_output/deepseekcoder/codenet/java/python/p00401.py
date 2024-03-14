<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```


import java.io.*;
import java.util.*;

public class p00401 {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int input = sc.nextInt();
        int ans = 1;
        while(input >= ans*2){
            ans *= 2;
        }
        out.println(ans);
        out.flush();

    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
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

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.reader = inp
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = FastScanner.StringTokenizer(self.reader.readline())
            except Exception:
                raise Exception
        return self.tokenizer.nextToken()

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                return self.reader.readline().rstrip('\n')
            except Exception:
                raise Exception
        return self.tokenizer.nextToken("\n")

    def nextLong(self):
        return long(self.next())

    def nextInt(self):
        return int(self.next())

    class StringTokenizer:
        def __init__(self, string):
            self.string = string
            self.start = 0
            self.length = len(string)

        def hasMoreTokens(self):
            return self.start < self.length

        def nextToken(self, delimiter=None):
            if delimiter is None:
                end = self.length
            else:
                end = self.string.find(delimiter, self.start)
                if end == -1:
                    end = self.length

            token = self.string[self.start:end]
            self.start = end + 1
            return token


def main():
    sc = FastScanner()
    print(2**(sc.nextInt()//2))


if __name__ == "__main__":
    main()
```
<|EOT|>
