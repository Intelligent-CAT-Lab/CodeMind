<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        List<Character> list = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        Collections.sort(list);
        List<List<Character>> groups = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Character> temp = new ArrayList<>();
            temp.add(list.get(i));
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    temp.add(list.get(j));
                } else {
                    groups.add(temp);
                    temp = new ArrayList<>();
                    temp.add(list.get(j));
                }
            }
            groups.add(temp);
        }
        int res = 0;
        for (List<Character> group : groups) {
            res += group.size() * (group.size() - 1) / 2 + 1;
        }
        System.out.println(res);
    }
}
```</s>
