

```python
import sys

a, b, c, x, y = map(int, sys.stdin.readline().split())

if a + b < 2 * c:
    print(x * a + y * b)
else:
    min_ = min(x, y)
    max_ = max(x, y)
    res = 0
    res += 2 * c * min_
    if max_ == x:
        res += min(a, 2 * c) * (max_ - min_)
    else:
        res += min(b, 2 * c) * (max_ - min_)
    print(res)
```

## Problem 3372

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
import java.io.*;
import java.util.StringTokenizer;

public class p03372 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        int res = 0;
        for (int i = 0; i < 10; i++) {
            res += arr[i] * (i + 1);
        }
        out.println(res);

        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public double[] nextDoubleArray(int n) {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public char[] nextCharArray(int n) {
            char[] arr = nextLine().trim().replaceAll("\\s", "").toCharArray();
            return arr;
        }

        public String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }
}

```

python code:

```python
import sys

arr = list(map(int, sys.stdin.readline().split()))

res = 0
for i in range(10):
    res += arr[i] * (i + 1)
print(res)
```

## Problem 3373

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10 10 10 10 10 10 10 10

Expected output:
100


```
import java.io.*;
import java.util.StringTokenizer;

public class p03373 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        int res = 0;
        for (int i = 0; i < 10; i++) {
            res += arr[i] * (i + 1);
        }
        out.println(res);

        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader
