<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import math

def is_square(n):
    return int(math.sqrt(n)) ** 2 == n

def main():
    s = input("Enter the first number: ")
    t = input("Enter the second number: ")
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b ** 2 == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
Note: The `FastScanner` class is not necessary in Python, as the `input()` function can be used to read input from the user. The `StringTokenizer` class is also not necessary, as Python has built-in support for splitting strings using the `split()` method.</s>
