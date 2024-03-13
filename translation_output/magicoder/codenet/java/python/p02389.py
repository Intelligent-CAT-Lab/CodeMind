<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

class InputReader:
    def __init__(self):
        self.br = sys.stdin

    def next_int(self):
        return int(self.br.readline())

    def next_long(self):
        return long(self.br.readline())

    def next_string(self):
        return self.br.readline().strip()

    def next_double(self):
        return float(self.br.readline())

class Solution:
    def solve(self):
        inp = InputReader()
        a = inp.next_int()
        b = inp.next_int()
        print(a*b, 2*a+2*b)

if __name__ == "__main__":
    solver = Solution()
    solver.solve()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the product and the sum of their double-sided perimeters, and then prints them.<｜end▁of▁sentence｜>
