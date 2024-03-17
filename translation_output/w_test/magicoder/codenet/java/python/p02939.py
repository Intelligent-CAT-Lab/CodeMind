<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
aabbaa

Expected output:
4


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
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

@@ Response
```python
class Scanner:
    def __init__(self):
        self.input = input()
        self.index = 0

    def next(self):
        if self.index >= len(self.input):
            return None
        start = self.index
        while self.index < len(self.input) and self.input[self.index] != ' ':
            self.index += 1
        return self.input[start:self.index]

scanner = Scanner()
s = scanner.next()
n = len(s)
count = 0
i = 0
while i < n:
    count += 1
    if i + 1 >= n:
        break
    if s[i] == s[i + 1]:
        if i + 2 >= n:
            break
        i += 2
        count += 1
    i += 1
print(count)
```

This Python code does the same thing as the Java code. It reads a string from the input, counts the number of pairs of consecutive identical characters, and prints the result.<｜end▁of▁sentence｜>
