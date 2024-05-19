System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
9


```
#!/usr/bin/env python

import sys
import math
import itertools as it
from collections import deque

sys.setrecursionlimit(10000000)

MOD = 10 ** 9 + 7

n, k = map(int, raw_input().split())

print k ** n % MOD

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 100000007;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = (ans * k) % mod;
        }
        System.out.println(ans);
    }
}
```

Test input:
```
2 3
```

Expected output:
```
9
```<|endoftext|>
