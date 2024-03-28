
```python
import sys

def solve():
    L, R = map(int, sys.stdin.readline().split())

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

solve()
```

## 2984. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

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
        
        int n = sc.nextInt();

        System.out.println(n);
    }
}
  
public class p02984 
{ 
    public static void main(String[] args) 
    { 
        Solution ob = new Solution();

        ob.solve();
    } 
} 
```

python code:
```python
import sys

def solve():
    n = int(sys.stdin.readline())

    print(n)

solve()
```

## 2985. 1000000008

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000008

Expected output:
1000000008

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
        
        long n = sc.nextLong();

        System.out.println(n);
    }
}
  
public class p02985 
{ 
    public static void main(String[] args) 
    { 
        Solution ob = new Solution();

        ob.solve();
    } 
} 
```

python code:
```python
import sys

def solve():
    n = int(sys.stdin.readline())

    print(n)

solve()
```

## 2986. 1000000009

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000009

Expected output:
1000000009

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
        
        long n = sc.nextLong();

        System.out.println(n);
    }
}
  
public class p02986 
{ 
    public static void main(String[] args) 
    { 
        Solution ob = new Solution();

        ob.solve();
    } 
} 
```

python code:
```python
import sys

def solve():
    n = int(sys.stdin.readline())

    print(n)

solve()
```

## 2987. 1000000010

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000010

Expected output:
1000000010

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
