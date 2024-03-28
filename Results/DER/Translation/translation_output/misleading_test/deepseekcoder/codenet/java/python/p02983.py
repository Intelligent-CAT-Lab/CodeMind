<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2020 2040

Expected output:
37

```
import java.io.*;
import java.util.*;

class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 
    
    public FastReader() 
    { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 
    
    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 
    
    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 
    
    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 
    
    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 
    
    String nextLine() 
    { 
          String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
} 

class Solution
{
    void solve()
    {
        FastReader sc = new FastReader();
        
        int L = sc.nextInt();
        int R = sc.nextInt();

        R -= L;
        L %= 2019;
        R += L;

        int res = 2019; //max value

        if(R - L > 2019)
        {
            System.out.println(0);
            return;
        }

        for(int i = L; i <= R; i++)
        {
            for(int j = L; j < i ; j++)
            {
                res = Math.min(res, (i*j) % 2019);
            }
        }

        System.out.println(res);
    }
}
  
public class p02983 
{ 
    public static void main(String[] args) 
    { 
        Solution ob = new Solution();

        ob.solve();
    } 
} 
```

### Response:
```python
class FastReader:
    import sys
    import io
    import string
    import re

    def __init__(self, s=None):
        if s is None or len(s) == 0:
            self.s = sys.stdin.read().strip()
        else:
            self.s = s.strip()
        self.s = re.split(r'\s+', self.s)
        self.i = 0

    def next(self):
        while self.i < len(self.s) and self.s[self.i] == '':
            self.i += 1
        res = ''
        while self.i < len(self.s) and self.s[self.i][0] in string.ascii_letters:
            res += self.s[self.i]
            self.i += 1
        return res

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        while self.i < len(self.s) and self.s[self.i] == '':
            self.i += 1
        res = ''
        while self.i < len(self.s) and self.s[self.i][0] not in string.ascii_letters:
            res += self.s[self.i]
            self.i += 1
        return res.strip()


class Solution:
    def solve(self):
        sc = FastReader()
        L = sc.nextInt()
        R = sc.nextInt()

        R -= L
        L %= 2019
        R += L

        res = 2019

        if R - L > 2019:
            print(0)
            return

        for i in range(L, R + 1):
            for j in range(L, i):
                res = min(res, (i * j) % 2019)
        print(res)


if __name__ == "__main__":
    ob = Solution()
    ob.solve()
```
<|EOT|>
