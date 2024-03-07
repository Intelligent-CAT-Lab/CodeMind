<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import math
import sys

n, m = map(float, input().split())

for i in range(m - int(n % m)):
    print(int(n / m), end=" ")

for i in range(int(m - (n % m)), m):
    print(math.ceil(n / m), end=" ")
```
This is the Python code equivalent to the Java code you provided. It uses the `math` module to perform the necessary calculations, and the `sys` module to read input from the user.

The `map` function is used to convert the input string into a list of floats, and the `split` method is used to split the input string into two separate strings. The `int` function is used to convert the input strings into integers.

The `for` loop is used to iterate over the range of values from `m - int(n % m)` to `m`, and the `print` function is used to print the result. The `end` parameter is used to specify that the output should be printed on the same line.

The `math.ceil` function is used to round the result up to the nearest integer.

Note that the Python code uses the `input` function to read input from the user, while the Java code uses the `Scanner` class to read input from the user. The `input` function is more convenient and easier to use, but it may not be suitable for all use cases.</s>
