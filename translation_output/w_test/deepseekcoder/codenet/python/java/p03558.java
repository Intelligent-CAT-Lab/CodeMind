<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
from collections import deque
q = deque()
K = int(input())
q.append((1, 1))
m = {}
while len(q):
 n, s = q.popleft()
 if n in m:continue
 m[n] = s
 q.appendleft((n * 10 % K, s))
 q.append(((n + 1) % K, s + 1))
print(m[0])
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<int[]> q = new ArrayDeque<>();
        Map<Integer, Integer> m = new HashMap<>();
        q.add(new int[]{1, 1});
        while (!q.isEmpty()) {
            int[] pair = q.pollFirst();
            int n = pair[0], s = pair[1];
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.addFirst(new int[]{n * 10 % K, s});
            q.add(new int[]{ (n + 1) % K, s + 1});
        }
        System.out.println(m.get(0));
    }
}
```

This Java code does the same thing as the Python code. It uses a deque (double-ended queue) to store pairs of integers, and a map to store the results. The while loop continues until the deque is empty. For each pair, it adds two new pairs to the deque: one where the first number is the remainder of the first number multiplied by 10 divided by K, and the second number is the second number plus 1; and one where the first number is the remainder of the first number plus 1 divided by K, and the second number is the second number. If the first number is already in the map, it skips the current iteration. Finally, it prints the second number of the pair with the first number 0.
<|EOT|>
