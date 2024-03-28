<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

class FastScanner:
    def __init__(self, inp):
        self.inp = inp
        self.tokens = None

    def next(self):
        while self.tokens is None or not self.tokens.hasMoreTokens():
            self.tokens = self.inp.readline().split()
        return self.tokens.nextToken()

    def nextLine(self):
        while self.tokens is None or not self.tokens.hasMoreTokens():
            self.tokens = self.inp.readline().split()
        return self.tokens.nextToken("\n")

    def nextLong(self):
        return long(self.next())

    def nextInt(self):
        return int(self.next())


def main():
    sc = FastScanner(sys.stdin)
    input = sc.nextInt()
    ans = 1
    while input >= ans * 2:
        ans *= 2
    print(ans)


if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in StringTokenizer class like Java, so we have to implement it manually. Also, Python does not have a PrintWriter class like Java, so we use the built-in print function.<｜end▁of▁sentence｜>
