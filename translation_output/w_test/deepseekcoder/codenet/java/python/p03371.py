<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1500 2000 1600 3 2

Expected output:
7900


```
import java.io.*;
import java.util.StringTokenizer;

public class p03371 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        if (a + b < 2 * c) {
            out.println(x * a + y * b);
        } else {
            int min = Math.min(x, y);
            int max = Math.max(x, y);
            int res = 0;
            res += 2 * c * min;
            if (max == x) {
                res += Math.min(a, 2 * c) * (max - min);
            } else {
                res += Math.min(b, 2 * c) * (max - min);
            }
            out.println(res);
        }

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

### Response:
```python
import sys

def main():
    a, b, c, x, y = map(int, sys.stdin.readline().split())

    if a + b < 2 * c:
        print(x * a + y * b)
    else:
        min_val = min(x, y)
        max_val = max(x, y)
        res = 0
        res += 2 * c * min_val
        if max_val == x:
            res += min(a, 2 * c) * (max_val - min_val)
        else:
            res += min(b, 2 * c) * (max_val - min_val)
        print(res)

if __name__ == "__main__":
    main()
```

This Python code reads the input from the standard input, and then checks if the sum of `a` and `b` is less than twice the value of `c`. If it is, it prints the product of `x` and `a` plus the product of `y` and `b`. If it's not, it calculates the result based on the conditions given in the Java code and prints it.
<|EOT|>
