Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5

Expected output:
-85 -79

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
// ??Â¨?????????????????????
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
//   ??????
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}

  static class InputReader {
//   ??\???
    public BufferedReader br;
    public StringTokenizer st;
    
    public InputReader(InputStream stream) {
//     ?????????????????????
      br = new BufferedReader(new InputStreamReader(stream));
    }
   
//   ????????????????????????
    public int nextInt() throws IOException {
      while (st == null ||!st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }
    
    public long nextLong() throws IOException {
      while (st == null ||!st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken()); 
    }
    
    public String next() throws IOException {
      while (st == null ||!st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }
    
    public double nextDouble() throws IOException {
      while (st == null ||!st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }
    
  }
  
}
```

### Response:
```python
import sys

class Solution:
    def solve(self):
        a = int(input())
        b = int(input())
        print(a*b, 2*a+2*b)

class InputReader:
    def __init__(self, stream):
        self.br = sys.stdin if stream == sys.stdin else open(stream, 'r')
        self.st = None

    def close(self):
        if self.br!= sys.stdin:
            self.br.close()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def next(self):
        if self.st is None:
            self.st = self.br.readline().strip().split()
        return self.st.pop(0)

    def nextDouble(self):
        return float(self.next())

in_ = InputReader(sys.stdin)
out = sys.stdout
solver = Solution()
solver.solve()
in_.close()
```<|endoftext|>
