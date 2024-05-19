System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class p03320{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        long d[]=new long [1000];

        ArrayList<P> lis = new ArrayList<P>();
        long a=9,b=10;
        for(int i=1; i<10; i++) {
            lis.add(new P(i, -11+i));
        }
            lis.add(new P(19, -1));

        for(int i=1; i<15; i++) {
            for (long w=1; w<1000 ;w++ ){
                long x=w*b+a, y=x;
                int e=0;
                while(x>0){e+=x%10; x/=10; }
                lis.add(new P(y,(double)y/e));
            }
            b*=10; a*=10; a+=9;
        }
        sort(lis);
        long max=0;
        for (int w=0; w<lis.size() ;w++ ){
            if(max<lis.get(w).x){
            // db(lis.get(w).x,lis.get(w).d);
            max=lis.get(w).x;
            out.println(max);
            n--;
            if(n==0)break;
            }
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
        return  ( 0 < ( (x>>k) & 1 )  ) ? true:false;
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
        while( st==null ||!st.hasMoreTokens() )
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


Answer:
```python
import sys
import math

def main():
    n = int(input())
    c = 9
    d = 10
    ans = []
    for i in range(1, 10):
        ans.append((i, -11 + i))
    ans.append((19, -1))

    for i in range(1, 15):
        for j in range(1, 1000):
            x = j * d + c
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            ans.append((y, y / e))
        d *= 10
        c *= 10
        c += 9

    ans.sort(key=lambda x: x[0])
    for i in range(n):
        print(ans[i][0])

if __name__ == '__main__':
    main()
```<|endoftext|>
