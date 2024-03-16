<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    sc = sys.stdin
    out = sys.stdout
    input = int(sc.readline())
    ans = 1
    while input >= ans*2:
        ans *= 2
    out.write(str(ans))
    out.flush()


class FastScanner:
    def __init__(self, inp):
        self.inp = inp
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = tokenizer(self.inp.readline())
            except Exception as e:
                raise Exception(e)
        return self.tokenizer.nextToken()

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                return self.inp.readline()
            except Exception as e:
                raise Exception(e)
        return self.tokenizer.nextToken("\n")

    def nextLong(self):
        return long(self.next())

    def nextInt(self):
        return int(self.next())


if __name__ == "__main__":
    main()
```</s>
