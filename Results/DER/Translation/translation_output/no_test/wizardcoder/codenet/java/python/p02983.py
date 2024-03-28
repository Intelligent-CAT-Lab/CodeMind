Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
        while (st == null ||!st.hasMoreElements()) 
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
import sys

class FastReader:
    def __init__(self):
        self.buffer = ""
        self.pos = 0

    def readline(self):
        while self.pos >= len(self.buffer):
            try:
                self.buffer += sys.stdin.readline().strip()
            except:
                return ""
        line = self.buffer[self.pos:].strip()
        self.pos = len(self.buffer)
        return line

    def read(self):
        while self.pos >= len(self.buffer):
            try:
                self.buffer += sys.stdin.read().strip()
            except:
                return ""
        line = self.buffer[self.pos:].strip()
        self.pos = len(self.buffer)
        return line

    def next(self):
        return self.readline()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

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

        for i in range(L, R+1):
            for j in range(L, i):
                res = min(res, (i*j) % 2019)

        print(res)

if __name__ == '__main__':
    Solution().solve()
```<|endoftext|>
