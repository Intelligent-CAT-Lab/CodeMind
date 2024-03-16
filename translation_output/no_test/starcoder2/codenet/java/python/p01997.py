
```
import math

a, b = map(float, input().split())
print(4.0/3.0*math.pi*b*b*b)
```

## p01998

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class p01998 {

    static void solve (FastScanner in, PrintWriter out, Methods ms) {
        
        int n = in.nextInt();
        int[] ar = in.nextIntArray(n);
        int[] ar2 = new int[n];
        for (int i=0; i<n; i++) ar2[i] = ar[i];
        Arrays.sort(ar2);
        for (int i=0; i<n; i++) {
            if (ar[i]!=ar2[i]) {
                out.println("NO");
                return;
            }
        }
        out.println("YES");
        
    }
    


    public static void main(String[] args) {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Methods ms = new Methods();
        solve(in, out, ms);
        in.close();
        out.close();
    }

    static class Methods {

        public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

        public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

        public int min (int... ar) {Arrays.sort(ar); return ar[0];}

        public long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}

        public long lcm (long a, long b) {return a/gcd(a,b)*b;}

        public long factorial (int i) {
            if (i==1) return 1;
            else return i*factorial(i-1);
        }

        public int manhat (int x1, int y1, int x2, int y2) {
            return Math.abs(x1-x2)+Math.abs(y1-y2);
        }

        public double euclid (double x1, double y1, double x2, double y2) {
            return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        }

        public boolean isPrime (int n) {
            if (n==2) return true;
            if (n<2 || n%2==0) return false;
            for (int i=3; i<=Math.sqrt(n); i+=2) if(n%i==0) return false;
            return true;
        }

    }

    static class FastScanner {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        
