

```python
n = int(input())
ans = 0

#25cent
ans += n//25
n %= 25

#10cent
ans += n//10
n %= 10

#5cent
ans += n//5
n %= 5

#1cent
ans += n

print(ans)
```

## 02252

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
82

```
import java.util.*;
import java.io.*;

class p02252 {
    void solve () {
        
        int n = nextInt();
        int ans = 0;
        
        //25cent
        ans += n/25;
        n %= 25;
        
        //10cent
        ans += n/10;
        n %= 10;
        
        //5cent
        ans += n/5;
        n %= 5;
        
        //1cent
        ans += n;
        
        out.println(ans);
        
    }


    // <p02252 Method>
    public static PrintWriter out;
    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        new p02252().solve();
        out.flush();
    }

    // <Default Field>
    static int maxInt = Integer.MAX_VALUE, minInt = Integer.MIN_VALUE;
    static int mod = 1000000007;

    // <Default Method>
    static int max (int... ar) {Arrays.sort(ar);return ar[ar.length-1];}
    static int min (int... ar) {Arrays.sort(ar);return ar[0];}
    static int calcManhatDistance (int x1, int y1, int x2, int y2) {
        int d = Math.abs(x1-x2)+Math.abs(y1-y2);
        return d;
    }
    static double calcEuclidDistance (double x1, double y1, double x2, double y2) {
        double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return d;
    }
    static
