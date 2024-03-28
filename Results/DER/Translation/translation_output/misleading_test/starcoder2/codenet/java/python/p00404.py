

```python
import math

def search(x, y):
    x_min = 0
    y_min = 0
    x_max = 0
    y_max = 0
    f, f1, f2 = 1, 1, 0
    p = 0
    while True:
        if x_min <= x and x <= x_max and y_min <= y and y <= y_max:
            return p % 3 + 1
        f = f1 + f2
        if p % 4 == 0:
            x_max += f
        elif p % 4 == 1:
            y_max += f
        elif p % 4 == 2:
            x_min -= f
        else:
            y_min -= f
        f2 = f1
        f1 = f
        p += 1

x, y = map(int, input().split())
print(search(x, y))
```

## 00405

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;

class p00405{

    long search(long n){
        long x = 1;
        long y = 1;
        long z = 1;
        long w = 1;
        long t = 1;
        long u = 1;
        long v = 1;
        long a = 1;
        long b = 1;
        long c = 1;
        long d = 1;
        long e = 1;
        long f = 1;
        long g = 1;
        long h = 1;
        long i = 1;
        long j = 1;
        long k = 1;
        long l = 1;
        long m = 1;
        long o = 1;
        long p = 1;
        long q = 1;
        long r = 1;
        long s = 1;
        long u1 = 1;
        long u2 = 1;
        long u3 = 1;
        long u4 = 1;
        long u5 = 1;
        long u6 = 1;
        long u7 = 1;
        long u8 = 1;
        long u9 = 1;
        long u10 = 1;
        long u11 = 1;
        long u12 = 1;
        long u13 = 1;
        long u14 = 1;
        long u15 = 1;
        long u16 = 1;
        long u17 = 1;
        long u18 = 1;
        long u19 = 1;
        long u20 = 1;
        long u21 = 1;
        long u22 = 1;
        long u23 = 1;
        long u24 = 1;
        long u25 = 1;
        long u26 = 1;
        long u27 = 1;
        long u28 = 1;
        long u29 = 1;
        long u30 = 1;
        long u31 = 1;
        long u32 = 1;
        long u33 = 1;
        long u34 = 1;
        long u35 = 1;
        long u36 = 1;
        long u37 = 1;
        long u38 = 1;
        long u39 = 1;
        long u40 = 1;
        long u41 = 1;
        long u42 = 1;
        long u43 = 1;
        long u44 = 1;
        long u45 = 1;
        long u46 = 1;
        long u47 = 1;
        long u48 = 1;
        long u49 = 1;
        long u50 = 1;
        long u51 = 1;
        long u52 = 1;
        long u53 = 1;
        long u54 = 1;
        long u55 = 1;
        long u56 = 1;
        long u57 = 1;
        long u58 = 1;
        long u59 = 1;
        long u60 = 1;
        long u61 = 1;
        long u62 = 1;
        long u63 = 1;
        long u64 = 1;
        long u65 = 1;
        long u66 = 1;
        long u67 = 1;
        long u68 = 1;
        long u69 = 1;
        long u70 = 1;
        long u71 = 1;
        long u72 = 1;
        long u73 = 1;
        long u74 = 1;
        long u75 = 1;
        long u76 = 1;
        long u77 = 1;
        long u78 = 1;
        long u79 = 1;
        long u80 = 1;
        long u81 = 1;
        long u82 = 1;
        long u83 = 1;
        long u84 = 1;
        long u85 = 1;
        long u86 = 1;
        long u87 = 1;
        long u88 = 1;
        long u89 = 1;
        long u90 = 1;
        long u91 = 1;
        long u92 = 1;
        long u93 = 1;
        long u94 = 1;
        long u95 = 1;
        long u96 = 1;
        long u97 = 1;
        long u98 = 1;
        long u99 = 1;
        long u100 = 1;
        long u101 = 1;
        long u102 = 1;
        long u103 = 1;
        long u104 = 1;
        long u105 = 1;
        long u106 = 1;
        long u107 = 1;
        long u108 = 1;
        long u109 = 1;
        long u110 = 1;
        long u111 = 1;
        long u112 = 1;
        long u113 = 1;
        long u114 = 1;
        long u115 = 1;
        long u116 = 1;
        long u117 = 1;
        long u118 = 1;
        long u119 = 1;
        long u120 = 1;
        long u121 = 1;
        long u122 = 1;
        long u123 = 1;
        long u124 = 1;
        long u125 = 1;
        long u126 = 1;
        long u127 = 1;
        long u128 = 1;
        long u129 = 1;
        long u130
