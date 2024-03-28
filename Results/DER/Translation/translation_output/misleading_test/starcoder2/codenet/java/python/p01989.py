

```python
import sys

def solve(s):
    length = len(s)
    ans = 0
    for i in range(1, length-2):
        for j in range(i+1, length-1):
            for k in range(j+1, length):
                a = [s[0:i], s[i:j], s[j:k], s[k:length]]
                for x in range(0, 4):
                    if len(a[x]) != len(str(int(a[x]))):
                        continue
                b = [int(a[0]), int(a[1]), int(a[2]), int(a[3])]
                if b[0]<=255 and b[1]<=255 and b[2]<=255 and b[3]<=255:
                    ans += 1
    return ans

if __name__ == '__main__':
    s = sys.stdin.readline().strip()
    print(solve(s))
```

## 2. 1234567890

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567890

Expected output:
-10

```
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class p01989 {

    static void solve (FastScanner in, PrintWriter out, Methods ms) {
        
        String s = in.next();
        int length = s.length();
        int ans = 0;
        
        for (int i=1; i<length-2; i++) {
            for (int j=i+1; j<length-1; j++) {
                loop : for (int k=j+1; k<length; k++) {
                    
                    String[] a = {s.substring(0
