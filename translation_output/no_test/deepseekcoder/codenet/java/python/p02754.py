<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys
import io

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = io.StringIO()
        self.eof = False

    def next(self):
        if not self.eof:
            try:
                return self.buffer.readline().strip()
            except:
                self.eof = True
                return ""
        else:
            return ""

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

def main():
    sc = FastScanner(sys.stdin)
    n = sc.next_long()
    a = sc.next_long()
    b = sc.next_long()
    ans = 0
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two long integers and a long number from the standard input, calculates the result, and prints it. The FastScanner class is used to read the input more efficiently.
<|EOT|>
