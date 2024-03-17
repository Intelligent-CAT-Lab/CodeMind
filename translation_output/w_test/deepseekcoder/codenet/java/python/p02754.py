<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    ans = (n // (a + b)) * a + min(a, n % (a + b))
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `//` operator for integer division and the `%` operator for modulus to get the quotient and remainder of the division. The `min` function is used to get the minimum of two numbers. The `main` function reads the input, calculates the answer, and prints it. The `if __name__ == "__main__":` line ensures that the `main` function is only called when the script is run directly, not when it's imported as a module.
<|EOT|>
