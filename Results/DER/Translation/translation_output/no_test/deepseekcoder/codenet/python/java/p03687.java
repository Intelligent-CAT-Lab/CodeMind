<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char[] chars = S.toCharArray();

        List<Integer> o = new ArrayList<>();

        for (char a : new HashSet<>(Arrays.asList(chars))) {
            int j = 0;
            int m = 0;
            for (char b : chars) {
                if (a == b) {
                    j = 0;
                } else {
                    j += 1;
                    m = Math.max(m, j);
                }
            }
            o.add(m);
        }

        System.out.println(Collections.min(o));
    }
}
```

This Java code does the same thing as your Python code. It reads a string, counts the occurrences of each character, and then finds the maximum distance between any two different characters. The minimum of these maximum distances is then printed.
<|EOT|>
