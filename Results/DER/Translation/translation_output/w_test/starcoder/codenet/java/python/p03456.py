<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 21

Expected output:
Yes


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

python code:<fim_suffix><fim_middle>

```python
import sys

def is_square(n):
    if n == 0 or n == 1:
        return True
    x = n // 2
    seen = set([x])
    while x * x!= n:
        x = (x + (n // x)) // 2
        if x in seen:
            return False
        seen.add(x)
    return True

def main():
    for line in sys.stdin:
        a, b = map(int, line.split())
        if is_square(a + b) and is_square(a - b):
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    main()
```
<|endoftext|>
