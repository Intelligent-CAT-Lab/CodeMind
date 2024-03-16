<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys
from collections import deque

mod = 1000000007

def main():
    reader = Reader(sys.stdin)
    out = sys.stdout

    # int n=sc.nextInt();
    # char c[]=sc.nextString().toCharArray();
    # int l=c.length;

    c = list(reader.next_string())
    l = len(c)

    if c[0]=='0' or c[l-1]=='1':
        out.write(str(-1)+'\n')
        return
    else:
        for i in range(l//2):
            if c[i]!=c[l-i-2]:
                out.write(str(-1)+'\n')
                return

    out.write('1 2\n')

    for i in range(3, l+1):
        out.write(str(i-1)+' '+str(i)+'\n')
        if c[i-2]=='1':
            pass

    out.flush()

class Reader:
    def __init__(self, inp):
        self.x = inp
        self.st = None

    def next_string(self):
        while True:
            line = self.x.readline()
            if line:
                return line.strip()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in `long` type, so you may need to use `int` instead. Also, Python does not have a built-in `Arrays.deepToString` method, so you can use `str` to convert the array to a string.
<|EOT|>
