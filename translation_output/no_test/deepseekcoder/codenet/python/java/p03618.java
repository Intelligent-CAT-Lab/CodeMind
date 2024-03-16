<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) list.add(c);
        int l = s.length();
        BigInteger res = BigInteger.valueOf(l).multiply(BigInteger.valueOf(l - 1)).divide(BigInteger.valueOf(2)).add(BigInteger.ONE);
        for (char c : new HashSet<>(list)) {
            int p = Collections.frequency(list, c);
            res = res.subtract(BigInteger.valueOf(p).multiply(BigInteger.valueOf(p - 1)).divide(BigInteger.valueOf(2)));
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads a string, sorts it, counts the number of distinct characters, and then calculates the number of permutations of the string. The result is printed to the console.
<|EOT|>
