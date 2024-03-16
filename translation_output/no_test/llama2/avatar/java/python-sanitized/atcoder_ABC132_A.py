> Translate the following java code to python and enclose your solution inside :

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


## 解答


import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.Arrays
import java.util.HashSet
import java.util.Set
import java.util.StringTokenizer

class atcoder_ABC132_A:
    def __init__(self, input_stream: InputStream):
        self.reader = BufferedReader(InputStreamReader(input_stream))
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except IOError:
                raise RuntimeError
        return self.tokenizer.nextToken()

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                return self.reader.readline()
            except IOError:
                raise RuntimeError
        return self.tokenizer.nextToken("\n")

    def nextLong(self):
        return long(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n: int):
        a = [int(self.next()) for _ in range(n)]
        return a

    def nextLongArray(self, n: int):
        a = [long(self.next()) for _ in range(n)]
        return a


if __name__ == "__main__":
    input_stream = System.in
    scanner = atcoder_ABC132_A(input_stream)
    s = scanner.next()
    chars = set(s.split(" "))
    if len(chars) == 2:
        print("Yes")
    else:
        print("No")