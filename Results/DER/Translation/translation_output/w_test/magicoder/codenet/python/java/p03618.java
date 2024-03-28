<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        int l = s.length();
        int res = l * (l - 1) / 2 + 1;
        int count = 1;
        for (int i = 1; i < l; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                res -= count * (count - 1) / 2;
                count = 1;
            }
        }
        res -= count * (count - 1) / 2;
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, sorts the characters in the string, and then counts the number of ways to arrange the characters in the string. The result is the number of distinct strings that can be formed from the input string.<｜end▁of▁sentence｜>
