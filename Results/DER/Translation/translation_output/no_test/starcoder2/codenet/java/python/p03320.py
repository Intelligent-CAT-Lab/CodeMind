
```
import math
import sys

def main():
    n = int(input())
    lis = []
    a = 9
    b = 10
    for i in range(1, 10):
        lis.append((i, -11+i))
    lis.append((19, -1))
    for i in range(1, 15):
        for w in range(1, 1000):
            x = w*b+a
            y = x
            e = 0
            while x > 0:
                e += x%10
                x //= 10
            lis.append((y, y/e))
        b *= 10
        a *= 10
        a += 9
    lis.sort(key=lambda x: x[1])
    max = 0
    for w in range(len(lis)):
        if max < lis[w][0]:
            print(lis[w][0])
            n -= 1
            if n == 0:
                break

main()
```

## 3321

### 题目描述

给定一个长度为n的序列a，求一个长度为n的序列b，满足b[i] = a[i] + a[i+1] + a[i+2] + ... + a[n-1]。

### 输入格式

第一行一个整数n。

第二行n个整数a[i]。

### 输出格式

一行n个整数b[i]。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
15 14 12 9 5
```

### 数据范围

对于100%的数据，1 ≤ n ≤ 100000，0 ≤ a[i] ≤ 100000。

### 题解

```
import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class p03321{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        long a[]=new long [n];
        long b[]=new long [n];
        for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        long sum=0;
        for(int i=n-1; i>=0; i--) {
            sum+=a[i];
            b[i]=sum;
        }
        for(int i=0; i<n; i++) {
            out.print(b[i]+" ");
        }
        // db(d);

        // for (int w=0; w<n ;w++ )
        // out.println(d[w]);
        out.flush();
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
     
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }
     
    static boolean bit(long x,int k){
        // weather k-th bit (from right) be one or zero
        return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
    }    
}

class P implements Comparable<P>{
    long x;
    double d;
    P(long x, double d) {
        this.x=x;
        this.d=d;
    } 
      
    public int compareTo(P p){
        return (d - p.d)>0?1:-1;//des
    } 
}

class Reader
{ 
    private BufferedReader x;
    private StringTokenizer st;
    
    public Reader(InputStream in)
    {
        x = new BufferedReader(new InputStreamReader(in));
        st = null;
    }
    public String nextString() throws IOException
    {
        while( st==null || !st.hasMoreTokens() )
            st = new StringTokenizer(x.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(nextString());
    }
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
```

python code:
```
import math
import sys

def main():
    n = int(input())
    a = list(map(int, input().split()))
    b = [0 for
