<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 3 4

Expected output:
40

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

Here is the Python code that translates the Java code:
```python
import sys

class FastScanner:
    def __init__(self, stream):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            try:
                self.st = sys.stdin.readline()
            except Exception as e:
                print(e)
                sys.exit(1)
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.nextLong()
    a = sc.nextLong()
    b = sc.nextLong()
    ans = 0
    ans = (n / (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()
```
Note that the `FastScanner` class is not necessary in Python, as the `sys.stdin` object can be used to read input from the console. The `nextInt` and `nextLong` methods are also not necessary, as Python has built-in methods for reading integers and long integers from the console.</s>
