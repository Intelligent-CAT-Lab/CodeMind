<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class Scanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.st = None
        self.br = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except IOException as e:
                e.printStackTrace()
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLine(self):
        str = ""
        try:
            str = self.br.readLine()
        except IOException as e:
            e.printStackTrace()
        return str

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.nextInt()
        return arr

    def nextDoubleArray(self, n):
        arr = [0.0] * n
        for i in range(n):
            arr[i] = self.nextDouble()
        return arr

    def nextLongArray(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.nextLong()
        return arr

    def nextCharArray(self, n):
        arr = self.nextLine().strip().replace(" ", "").toCharArray()
        return arr

    def nextStringArray(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.next()
        return arr


class p03371:
    def __init__(self):
        self.scanner = Scanner(sys.stdin)
        self.out = PrintWriter(OutputStreamWriter(sys.stdout))

    def main(self):
        a = self.scanner.nextInt()
        b = self.scanner.nextInt()
        c = self.scanner.nextInt()
        x = self.scanner.nextInt()
        y = self.scanner.nextInt()

        if a + b < 2 * c:
            self.out.println(x * a + y * b)
        else:
            min = min(x, y)
            max = max(x, y)
            res = 0
            res += 2 * c * min
            if max == x:
                res += min(a, 2 * c) * (max - min)
            else:
                res += min(b, 2 * c) * (max - min)
            self.out.println(res)

        self.out.close()


if __name__ == "__main__":
    p03371().main()
```
Note that the `Scanner` class in Python is not exactly the same as the `Scanner` class in Java, but it should work similarly. The `PrintWriter` class in Python is also not exactly the same as the `PrintWriter` class in Java, but it should work similarly.</s>
