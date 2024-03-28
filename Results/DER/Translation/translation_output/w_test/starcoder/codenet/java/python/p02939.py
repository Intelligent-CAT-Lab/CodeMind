<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

s = sys.stdin.readline().strip()
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
```

'''
<|endoftext|>
