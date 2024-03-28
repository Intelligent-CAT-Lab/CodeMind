<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
54

Expected output:
129

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

def main():
    input = int(sys.stdin.readline())
    ans = 1
    while input >= ans*2:
        ans *= 2
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use `sys.stdin.readline()` to read the input from the standard input. The `int()` function is used to convert the input string to an integer. The rest of the code is the same as the Java code you provided.
<|EOT|>
