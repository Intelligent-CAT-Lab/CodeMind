<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
Here is the equivalent Java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> C = new HashMap<>();

        for (char c : S.toCharArray()) {
            C.put(c, C.getOrDefault(c, 0) + 1);
        }

        List<Integer> o = new ArrayList<>();

        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S.toCharArray()) {
                if (a != b) {
                    j += 1;
                    m = Math.max(m, j);
                } else {
                    j = 0;
                }
            }
            o.add(m);
        }

        o.sort(Integer::compareTo);
        System.out.println(o.get(0));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the occurrences of each character, and then finds the maximum distance between any two occurrences of the same character. It then prints the minimum of these maximum distances.<｜end▁of▁sentence｜>
