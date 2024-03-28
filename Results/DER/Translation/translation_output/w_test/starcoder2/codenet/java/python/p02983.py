

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

## 2984. 2019년

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2019

Expected output:
2019년은 윤년입니다.


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
        
        int year = sc.nextInt();

        if(year % 400 == 0)
        {
            System.out.println(year + "년은 윤년입니다.");
        }
        else if(year % 100 == 0)
        {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
        else if(year % 4 == 0)
        {
            System.out.println(year + "년은 윤년입니다.");
        }
        else
        {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
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
    year = int(sys.stdin.readline())

    if year % 400 == 0:
        print(year, "년은 윤년입니다.", sep="")
    elif year % 100 == 0:
        print(year, "년은 윤년이 아닙니다.", sep="")
    elif year % 4 == 0:
        print(year, "년은 윤년입니다.", sep="")
    else:
        print(year, "년은 윤년이 아닙니다.", sep="")

solve()
```

## 2985. 세 수

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20 30

Expected output:
10+20=30


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
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b == c)
        {
            System.out.println(a + "+" + b + "=" + c);
        }
        else if(a - b == c)
        {
            System.out.println(a + "-" + b + "=" + c);
        }
        else if(a * b == c)
        {
            System.out.println(a + "*" + b + "=" + c);
        }
        else if(a / b == c)
        {
            System.out.println(a + "/" + b + "=" + c);
        }
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
    a, b, c = map(int, sys.stdin.readline().split())

    if a + b == c:
        print(a, "+", b, "=", c, sep="")
    elif a - b == c:
        print(a, "-", b, "=", c, sep="")
    elif a * b == c:
        print(a, "*", b, "=", c, sep="")
    elif a / b == c:
        print(a, "/", b, "=", c, sep="")

solve()
```

## 2986. 터널의 입구와 출구

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10 10

Expected output:
0


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
