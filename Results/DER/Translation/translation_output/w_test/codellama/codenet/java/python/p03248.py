<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1111

Expected output:
-1


```
import java.util.*;
import java.io.*;
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class p03248{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        // int n=sc.nextInt();
        char c[]=sc.nextString().toCharArray();
        int l=c.length;

        if(c[0]=='0' || c[l-1]=='1'){out.println(-1);out.flush();return;}
        else {
            for (int i=0; i<l/2; i++) {
                if(c[i]!=c[l-i-2]){out.println(-1);out.flush(); return;}
            }
        }

        out.println(1+" "+2);

        for (int i=3,s=2; i<=l; i++) {
            out.println(s+" "+i);
            if(c[i-2]=='1'){
                s=i;
            }
        }


      
        // out.println(ans);
        out.flush();
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  

    static long gcd(long a, long b){
        if(min(a,b) == 0)return max(a,b);
        return gcd(max(a,b) % min(a,b),min(a,b));
    }
}

class P implements Comparable<P>{
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
    public int compareTo(P p){
        return d-p.d; //des
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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys
import math
import array

class Reader:
    def __init__(self, inp):
        self.inp = inp
        self.st = None

    def next_string(self):
        while self.st is None or not self.st.has_more_tokens():
            self.st = array.array('c', self.inp.readline())
        return self.st.next_token()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

class P:
    def __init__(self, id, d):
        self.id = id
        self.d = d

    def compare_to(self, p):
        return self.d - p.d

def main():
    sc = Reader(sys.stdin)
    out = sys.stdout
    n = sc.next_int()
    c = sc.next_string().to_char_array()
    l = len(c)

    if c[0] == '0' or c[l - 1] == '1':
        out.write(-1)
        out.flush()
        return
    else:
        for i in range(l // 2):
            if c[i] != c[l - i - 2]:
                out.write(-1)
                out.flush()
                return

    out.write(1 + " " + 2)

    for i in range(3, l):
        out.write(s + " " + i)
        if c[i - 2] == '1':
            s = i

    out.flush()

if __name__ == "__main__":
    main()
```
Note that the `to_char_array()` method is not a built-in method in Python, so you will need to define it yourself. Also, the `Reader` class is not a built-in class in Python, so you will need to define it yourself.</s>
