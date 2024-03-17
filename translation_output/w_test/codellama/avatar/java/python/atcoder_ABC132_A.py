<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
STOP

Expected output:
No


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class atcoder_ABC132_A {
    private static class FastScanner {
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        String s = sc.next();
        Set<String> chars = new HashSet<>();
        chars.addAll(Arrays.asList(s.split(" ")));
        if (chars.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    chars = set(s.split(" "))
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
This code reads a string from standard input, splits it into individual characters using the `split()` method, and then checks if the resulting list has exactly two unique elements. If it does, it prints "Yes" to standard output, otherwise it prints "No".

Note that the `split()` method is used to split the string into individual characters, and the `set()` function is used to create a set of unique elements from the resulting list. The `len()` function is used to check the length of the set, and the `print()` function is used to print the result to standard output.</s>
