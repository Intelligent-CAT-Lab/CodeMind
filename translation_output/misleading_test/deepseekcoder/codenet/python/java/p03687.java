<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char[] chars = S.toCharArray();
        ArrayList<Integer> o = new ArrayList<>();
        for (char a = 'a'; a <= 'z'; a++) {
            int j = 0;
            int m = 0;
            for (char b : chars) {
                if (a == b) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o.add(m);
        }
        int min = o.get(0);
        for (int i : o) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
```

This Java code does the same thing as your Python code. It counts the number of characters in the input string that are different from the current character and keeps track of the maximum count. It then prints the minimum of these counts.
<|EOT|>
