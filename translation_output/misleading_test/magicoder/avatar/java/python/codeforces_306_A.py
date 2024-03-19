<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Python version of the given Java code:

```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    for i in range(m - (n % m)):
        print(int(n / m), end=' ')
    for i in range((m - (n % m)), m):
        print(int(-(-n / m)), end=' ')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the quotient and remainder of the division of the first integer by the second, and then prints the quotient plus one for the first `m - (n % m)` numbers and the quotient for the rest. The `-(-n / m)` is used to calculate the ceiling of the division.<｜end▁of▁sentence｜>
