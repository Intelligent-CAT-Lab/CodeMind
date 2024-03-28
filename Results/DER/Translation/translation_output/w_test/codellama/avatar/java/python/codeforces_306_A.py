<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
87 34

Expected output:
2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 

```
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class codeforces_306_A {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osr = new OutputStreamWriter(System.out);
        PrintWriter o = new PrintWriter(osr);
        FastReader fr = new FastReader();
        double n = fr.nextDouble(), m = fr.nextDouble();
        for (int i = 0; i < m - (n % m); i++) {
            o.print((int) (n / m) + " ");
        }
        for (int i = (int) (m - (n % m)); i < m; i++) {
            o.print((int) ceil(n / m) + " ");
        }
        o.close();
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        InputStreamReader isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public int[] intArray(int size) throws IOException {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }

    public char[] charArray() throws IOException {
        return nextLine().toCharArray();
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static class Compare implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            return (o1.y - o2.y);
        }
    }
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import math

class FastReader:
    def __init__(self):
        self.br = open(0)

    def next(self):
        while True:
            line = self.br.readline()
            if line:
                return line.strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def int_array(self, size):
        return [self.next_int() for _ in range(size)]

    def char_array(self):
        return self.next().strip()

class Pair:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __lt__(self, other):
        return self.y < other.y

def main():
    fr = FastReader()
    n = fr.next_double()
    m = fr.next_double()
    for i in range(int(m - (n % m))):
        print(int(n / m), end=' ')
    for i in range(int(m - (n % m)), int(m)):
        print(int(math.ceil(n / m)), end=' ')

if __name__ == '__main__':
    main()
```
Note that the `FastReader` class in Python is similar to the `FastReader` class in Java, but it uses the `open(0)` function to read from standard input instead of using a `BufferedReader` object. The `Pair` class in Python is similar to the `Pair` class in Java, but it uses the `__lt__` method to define the comparison operator instead of using a `Comparator` object. The `main` function in Python is similar to the `main` function in Java, but it uses the `print` function to print the output instead of using a `PrintWriter` object.</s>
