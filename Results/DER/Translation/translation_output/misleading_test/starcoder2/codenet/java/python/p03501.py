
```python
import sys

N, A, B = map(int, sys.stdin.readline().split())
print(min(A*N, B))
```


```

python code:
```python
import sys

N = int(sys.stdin.readline())

for i in range(N):
    print(i+1)
```
/Python/0001.md
# 0001

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
1
2
3
4
5

```
import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class p0001 {
    static final long MOD = 998244353L;
    //static final long INF = 1000000000000000007L;
    //static final long MOD = 1000000007L;
    //static final int INF = 1000000007;
    
    //static long[] factorial;
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        for (int i = 0; i < N; i++) {
            pw.println(i+1);
        }
        pw.close();
    }
    
    public static long dist(long[] p1, long[] p2) {
        return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
    }
    
    //Find the GCD of two numbers
    public static long gcd(long a, long b) {
        if (a < b) return gcd(b,a);
        if (b == 0)
            return a;
        else
            return gcd(b,a%b);
    }
    
    //Fast exponentiation (x^y mod m)
    public static long power(long x, long y, long m) { 
        if (y < 0) return 0L;
        long ans = 1;
        x %= m;
        while (y > 0) { 
            if(y % 2 == 1) 
                ans = (ans * x) % m; 
            y /= 2;  
            x = (x * x) % m;
        } 
        return ans; 
    }
    
    public static int[] shuffle(int[] array) {
        Random rgen = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }
    
    public static long[] shuffle
