<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 21

Expected output:
Yevs

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 

public class p03456
{
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
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
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }

        public String nextline() {
            return null;
        }
    }
 
    public static void main(String[] args) 
    {
        FastScanner sc=new FastScanner();
        String s=sc.next(),t=sc.next();
        String mah=s+t;
        int a=Integer.parseInt(mah);
        int b= (int) Math.sqrt(a);
        if(b*b==a) System.out.println("Yes");
        else System.out.println("No");
    }

    
}
```
[/INST]
```python
import sys

def fast_scanner():
    br = sys.stdin
    st = StringTokenizer("")
    def next():
        while not st.hasMoreTokens():
            try:
                st = StringTokenizer(br.readline())
            except:
                raise Exception("Input error")
        return st.nextToken()
    def nextInt():
        return int(next())
    def readArray(n):
        a = [int(nextInt()) for _ in range(n)]
        return a
    def nextLong():
        return long(next())
    return {
        "next": next,
        "nextInt": nextInt,
        "readArray": readArray,
        "nextLong": nextLong,
        "nextline": None
    }

if __name__ == "__main__":
    sc = fast_scanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b*b == a:
        print("Yes")
    else:
        print("No")
```</s>
