<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
87 34

Expected output:
94 -94 43 12 56 -8 101 21 92 -19 68 -19 -89 -66 30 79 92 -53 -88 -65 -88 -23 -38 -62 -66 69 -30 -28 -46 -81 -79 49 -51 76

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
```python
import math

def main():
    n, m = map(float, input().split())
    for i in range(m - (n % m)):
        print(int(n / m))
    for i in range(int(m - (n % m)), m):
        print(int(math.ceil(n / m)))

if __name__ == '__main__':
    main()
```
This is the Python code for the given Java code. The code uses the `math` module to perform the necessary mathematical operations, such as division and ceiling. The `map` function is used to convert the input string to a list of floats, and the `range` function is used to iterate over the values of `i`. The `print` function is used to output the results.

Note that the `FastReader` class is not needed in Python, as the `input` function can be used to read input from the user. The `StringTokenizer` class is also not needed, as the `split` function can be used to split a string into a list of substrings. The `Pair` class is not needed in Python, as tuples can be used to store pairs of values. The `Comparator` interface is not needed in Python, as the `sorted` function can be used to sort a list of values.</s>
