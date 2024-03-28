<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
from fractions import gcd
from itertools import groupby as gb
from itertools import permutations as perm
from collections import Counter as C
from collections import defaultdict as dd
sys.setrecursionlimit(10**5)

s = input()
s = sorted(s)
g = gb(s)
l = len(s)

res = l * (l - 1) // 2 + 1
for k, v in g:
    p = len(list(v))
    res -= p * (p - 1) // 2
print(res)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(0, s.length() - 1);
        s = s.substring(1);
        s = s + s.charAt(0);
        int n = s.length();
        int res = n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    cnt++;
                }
            }
            res -= cnt * (cnt - 1) / 2;
        }
        System.out.println(res);
    }
}
```
<|endoftext|>
