<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys
import math

def main():
    a, b, c, x, y = map(int, sys.stdin.readline().split())
    if a + b < 2 * c:
        print(x * a + y * b)
    else:
        min_xy = min(x, y)
        max_xy = max(x, y)
        res = 0
        res += 2 * c * min_xy
        if max_xy == x:
            res += math.min(a, 2 * c) * (max_xy - min_xy)
        else:
            res += math.min(b, 2 * c) * (max_xy - min_xy)
        print(res)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read input from stdin and the `math` module to perform mathematical operations. The code is structured similarly to the Java code, with a `main` function that reads input and performs the necessary calculations. The `if` statement is used to determine which calculation to perform based on the value of `a + b`. The `min` and `max` functions are used to find the minimum and maximum values of `x` and `y`, respectively. The `math.min` function is used to find the minimum of `a` and `2 * c`, and the `math.max` function is used to find the maximum of `x` and `y`. The result is then printed to stdout.</s>
