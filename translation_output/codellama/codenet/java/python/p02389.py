<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

class InputReader:
    def __init__(self, stream):
        self.br = BufferedReader(InputStreamReader(stream))

    def nextInt(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.br.readLine())
        return int(self.st.nextToken())

    def nextLong(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.br.readLine())
        return long(self.st.nextToken())

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.br.readLine())
        return self.st.nextToken()

    def nextDouble(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.br.readLine())
        return float(self.st.nextToken())

class Solution:
    def solve(self):
        a = in.nextInt()
        b = in.nextInt()
        out.println(a*b + " " + (2*a + 2*b))

if __name__ == "__main__":
    in = InputReader(sys.stdin)
    out = PrintWriter(sys.stdout)
    solver = Solution()
    solver.solve()
    out.close()
```
This is a Python implementation of the Java code you provided. It uses the `sys` module to read from standard input and write to standard output, and it defines a `InputReader` class that reads input from a stream and provides methods for parsing integers, longs, strings, and doubles. The `Solution` class defines a `solve` method that reads two integers from the input, calculates their product and the sum of their doubled values, and prints the result to the output. The `main` function creates an instance of the `InputReader` class, an instance of the `Solution` class, and calls the `solve` method of the `Solution` class.</s>
