Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("a", "");
        s = s.replaceAll("t", "");
        s = s.replaceAll("c", "");
        s = s.replaceAll("g", "");
        s = s.replaceAll("A", "");
        s = s.replaceAll("T", "");
        s = s.replaceAll("C", "");
        s = s.replaceAll("G", "");
        s = s.replaceAll("\\s", "");
        s = s.toLowerCase();
        int n = s.length();
        int res = n * (n - 1) / 2 + 1;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == c) {
                    count++;
                }
            }
            res -= count * (count - 1) / 2;
        }
        System.out.println(res);
    }
}
```<|endoftext|>
