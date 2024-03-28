

```python
import sys

n, k = map(int, sys.stdin.readline().split())

for bit in range(1 << n):
    if bin(bit).count('1') != k:
        continue
    print(bit, end=':')
    for j in range(n):
        if (bit >> j) & 1:
            print(' ', j, end='')
    print()
```

## 02431

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
7: 0 1 2
11: 0 1 3
13: 0 2 3
14: 1 2 3
19: 0 1 4
21: 0 2 4
22: 1 2 4
25: 0 3 4
26: 1 3 4
28: 2 3 4


```
import java.util.*;
import java.io.*;

public class p02430 {

    void solve (FastScanner in, PrintWriter out, Methods ms) {
        
        int n = in.nextInt(), k = in.nextInt();
        
        for (int bit=0; bit<(1<<n); bit++) {
            if (Integer.bitCount(bit) != k) continue;
            out.print(bit+":");
            for (int j=0; j<n; j++) {
                if (((bit>>j) & 1) == 1) {
                    out.print(" "+j);
                }
            }
            out.println();
        }
        
    }



    public static void main(String[] args) {
        p02430 main = new p02430();
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Methods ms = new Methods();
        main.solve(in, out, ms);
        in.close();
        out.close();
    }

    static class Methods {

        public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

        public void yesno (PrintWriter out, boolean b) {out.println(b?"Yes":"No");}

        public void YESNO (PrintWriter out, boolean b) {out.println(b?"YES":"NO");}

        public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

        public int min (int... ar) {Arrays.sort(ar); return ar[0];}

    }

    static class FastScanner {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        private  int length = 0, p = 0;

        public FastScanner (InputStream stream) {
            in = stream;
        }

        public boolean hasNextByte () {
            if (p < length) return true;
            else {
                p = 0;
                try {length = in.read(buffer);}
                catch (Exception e) {e.printStackTrace();}
                if
