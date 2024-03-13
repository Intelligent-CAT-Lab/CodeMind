<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        int l = s.length();
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        long res = l * (l - 1) / 2 + 1;
        for (long v : map.values()) {
            res -= v * (v - 1) / 2;
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, sorts the characters in the string, counts the occurrences of each character, and then calculates the result. The result is printed to the standard output.<｜end▁of▁sentence｜>
