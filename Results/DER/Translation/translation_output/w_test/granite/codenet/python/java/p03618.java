System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aatt

Expected output:
5


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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        long res = (long)n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && arr[j] == arr[i]) j++;
            int count = j - i;
            res -= (long)count * (count - 1) / 2;
            i = j - 1;
        }
        System.out.println(res);
    }
}
```

Test input:
aatt

Expected output:
5<|endoftext|>
