<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2020 2040

Expected output:
2


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
[/INST]
```python
import sys

def fast_reader():
    br = sys.stdin
    st = None

    def next():
        nonlocal st
        while st is None or not st.hasmoreelements():
            try:
                st = br.readline().split()
            except Exception as e:
                e.printStackTrace()
        return st[0]

    def next_int():
        return int(next())

    def next_long():
        return long(next())

    def next_double():
        return float(next())

    def next_line():
        return next()


def solve():
    L = next_int()
    R = next_int()

    R -= L
    L %= 2019
    R += L

    res = 2019  # max value

    if R - L > 2019:
        print(0)
        return

    for i in range(L, R+1):
        for j in range(L, i):
            res = min(res, (i*j) % 2019)

    print(res)


if __name__ == "__main__":
    solve()
```</s>
