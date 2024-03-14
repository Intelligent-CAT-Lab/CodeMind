Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;

class p02939 {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        char[] s = scanner.next().toCharArray();
        int n = s.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (i + 1 >= n) {
                break;
            }
            if (s[i] == s[i + 1]) {
                if (i + 2 >= n) {
                    break;
                }
                i += 2;
                count++;
            }
        }
        System.out.println(count);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
```

### Response:
```python
import java.io.*;
import java.util.*;

class p02939:
    scanner = Scanner()

    def main(self):
        s = self.scanner.next().toCharArray()
        n = len(s)
        count = 0
        for i in range(n):
            count += 1
            if i + 1 >= n:
                break
            if s[i] == s[i + 1]:
                if i + 2 >= n:
                    break
                i += 2
                count += 1
        print(count)

    class Scanner:
        def __init__(self):
            self.reader = BufferedReader(InputStreamReader(System.in), 1 << 15)
            self.tokenizer = None

        def next(self):
            while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = StringTokenizer(self.reader.readLine())
            return self.tokenizer.nextToken()

        def nextInt(self):
            return int(self.next())

        def nextLong(self):
            return long(self.next())

        def nextDouble(self):
            return float(self.next())
```<|endoftext|>
