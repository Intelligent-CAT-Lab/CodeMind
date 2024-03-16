<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        q.add(new int[]{1, 1});
        Map<Integer, Integer> m = new HashMap<>();
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

This Java code does the same thing as the Python code. It uses a `Deque` (double-ended queue) to store pairs of integers, and a `Map` (hash map) to store the results. The `while` loop continues until the queue is empty. For each pair, it adds two new pairs to the queue and stores the pair in the map if it's not already there. Finally, it prints the second element of the pair with key 0.
<|EOT|>
