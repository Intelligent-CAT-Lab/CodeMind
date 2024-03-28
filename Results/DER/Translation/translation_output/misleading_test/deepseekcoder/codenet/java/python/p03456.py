<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import sys
import math

def main():
    s, t = input().split()
    mah = s + t
    a = int(mah)
    b = math.isqrt(a)
    if b*b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input().split()` function to read two strings from the input. We concatenate these two strings and convert the result to an integer. Then we calculate the integer square root of this number and check if it's a perfect square. If it is, we print "Yes", otherwise we print "No".
<|EOT|>
