<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aatt

Expected output:
38

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
Here is the Java version of the Python code:

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
        int l = s.length();
        int res = l * (l - 1) / 2 + 1;
        for (int i = 0; i < l;) {
            int j = i;
            while (j < l && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int p = j - i;
            res -= p * (p - 1) / 2;
            i = j;
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads a string, sorts it, and then counts the number of ways to choose 2 characters from the string without regard to order. The result is printed to the console.
<|EOT|>
