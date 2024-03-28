<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5

Expected output:
15 16


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class p02389 {
//  ??Â¨?????????????????????
  static InputReader in;
  static PrintWriter out;
  
  static class Solution {
    void solve() throws IOException {
      int a = in.nextInt();
      int b = in.nextInt();
      out.println(a*b+" "+(2*a+2*b));
    }
  }

  public static void main(String[] args) throws IOException {
//    ??????
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}

  static class InputReader {
//    ??\???
    public BufferedReader br;
    public StringTokenizer st;
    
    public InputReader(InputStream stream) {
//      ?????????????????????
      br = new BufferedReader(new InputStreamReader(stream));
    }
   
//    ????????????????????????
    public int nextInt() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }
    
    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken()); 
    }
    
    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }
    
    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }
    
  }
  
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class InputReader:
    def __init__(self, stream):
        self.br = sys.stdin
        self.st = None

    def nextInt(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = sys.stdin.readline()
        return int(self.st.nextToken())

    def nextLong(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = sys.stdin.readline()
        return long(self.st.nextToken())

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = sys.stdin.readline()
        return self.st.nextToken()

    def nextDouble(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = sys.stdin.readline()
        return float(self.st.nextToken())

class Solution:
    def solve(self):
        a = in.nextInt()
        b = in.nextInt()
        print(a*b, 2*a+2*b)

if __name__ == "__main__":
    in = InputReader(sys.stdin)
    out = sys.stdout
    solver = Solution()
    solver.solve()
    out.close()
```
Note that the `InputReader` class is not necessary in Python, as the `sys.stdin` and `sys.stdout` objects can be used directly to read and write input and output. The `nextInt`, `nextLong`, `next`, `nextDouble` methods are also not necessary, as Python has built-in methods for reading input and writing output.</s>
