<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 3 4

Expected output:
4


```
import java.util.*;
import java.io.*;
public class p02754
{
    public static void main(String[] args) {
        FastScanner sc=new FastScanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        long ans=0;
       ans=(n/(a+b))*a+Math.min(a,n%(a+b));
       System.out.println(ans);
       
        
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next()); 
        }
    }

}

```
[/INST]
```python
import sys

def fast_scanner(stream):
    br = sys.stdin
    st = None

    def next():
        while st is None or not st.hasMoreTokens():
            try:
                st = str(br.readline()).split()
            except Exception as e:
                e.printStackTrace()
        return st[0]

    def next_int():
        return int(next())

    def next_long():
        return long(next())


n = int(input())
a = int(input())
b = int(input())

ans = (n / (a + b)) * a + min(a, n % (a + b))

print(ans)
```</s>
