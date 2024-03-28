<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
serval

Expected output:
1

```
from collections import Counter

S = list(input())
C = Counter(S)

o = []

for a in C.keys():
    j = 0
    m = 0
    for b in S:
        if a == b:
            j = 0
        else:
            j += 1
            m = max(m,j)
    o.append(m)

print(min(o))
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == entry.getKey()) {
                    count = 0;
                } else {
                    count++;
                }
            }
            list.add(Math.max(count, 1));
        }
        System.out.println(Collections.min(list));
    }
}
```</s>
