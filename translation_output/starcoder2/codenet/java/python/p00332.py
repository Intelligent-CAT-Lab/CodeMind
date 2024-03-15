
```
import sys

e, y = map(int, input().split())

if e == 0:
    if 1868 <= y and y <= 1911:
        print("M" + str(y - 1867))
    elif 1912 <= y and y <= 1925:
        print("T" + str(y - 1911))
    elif 1926 <= y and y <= 1988:
        print("S" + str(y - 1925))
    else:
        print("H" + str(y - 1988))
elif e == 1:
    print(1867 + y)
elif e == 2:
    print(1911 + y)
elif e == 3:
    print(1925 + y)
elif e == 4:
    print(1988 + y)
```

## 00333

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p00333 {

    static void solve (FastScanner in, PrintWriter out, Methods ms) {

        int n = in.nextInt();
        int[] ar = in.nextIntArray(n);

        int[] ar2 = new int[n];
        for (int i=0; i<n; i++) {
            ar2[i] = ar[i];
        }

        Arrays.sort(ar);

        for (int i=0; i<n; i++) {
            
