<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

class FastScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = sys.stdin.readline().split()

    def next(self):
        while not self.st:
            try:
                self.st = sys.stdin.readline().split()
            except:
                pass
        return self.st[0]

    def nextInt(self):
        return int(self.next())

    def readArray(self, n):
        a = [int(x) for x in self.nextInt() for _ in range(n)]
        return a

    def nextLong(self):
        return long(self.next())

    def nextline(self):
        return None


if __name__ == "__main__":
    sc = FastScanner()
    s, t = sc.next(), sc.next()
    mah = s + t
    a = sc.nextInt()
    b = int(math.sqrt(a))
    if b * b == a:
        print("Yes")
    else:
        print("No")
```</s>
