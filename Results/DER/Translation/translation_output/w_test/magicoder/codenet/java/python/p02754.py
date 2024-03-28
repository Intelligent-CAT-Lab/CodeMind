<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the answer, and prints it. The `//` operator is used for integer division in Python, and the `%` operator is used for modulo operation. The `min` function is used to get the minimum of two numbers.<｜end▁of▁sentence｜>
