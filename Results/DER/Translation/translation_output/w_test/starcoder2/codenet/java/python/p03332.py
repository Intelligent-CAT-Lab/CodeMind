

```python
import sys

n, a, b, k = map(int, sys.stdin.readline().split())

M = 998244353

nck = [1] * (n + 1)
for i in range(1, n + 1):
    nck[i] = nck[i - 1] * (n - i + 1) * pow(i, M - 2, M) % M

ans = 0
for i in range(n + 1):
    if (k - a * i) % b == 0 and (k - a * i) // b <= n:
        ans += nck[i] * nck[(k - a * i) // b] % M

print(ans % M)
```


```

python code:

```python
import sys

n, m = map(int, sys.stdin.readline().split())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        ans += i * j

print(ans)
```
/p03331.md
# p03331

## Problem

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
36


```
import java.io.*;
import java.util.*;

public class p03331 {
    static final StdIn in = new StdIn();
    static final PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n=in.nextInt(), m=in.nextInt(), ans=0;
        for(int i=1; i<=n; ++i)
            for(int j=1; j<=m; ++j)
                ans+=i*j;
        out.println(ans);
        out.close();
    }
    
    static class StdIn {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        public StdIn() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public StdIn(InputStream in) {
            try{
                din = new DataInputStream(in);
            } catch(Exception e) {
                throw new RuntimeException();
            }
            buffer = new byte[BUFFER_SIZE
