<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

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
            int[] pair = q.poll();
            int n = pair[0];
            int s = pair[1];
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.addFirst(new int[]{n * 10 % K, s});
            q.add(new int[]{(n + 1) % K, s + 1});
        }
        System.out.println(m.get(0));
    }
}
```

This Java code does the same thing as the Python code. It uses a `Deque` to simulate the queue data structure and a `Map` to store the results. The `Deque` is used to store pairs of integers, where the first integer is the remainder of the current number when divided by `K`, and the second integer is the current sum. The `Map` is used to store the results, where the key is the remainder and the value is the sum. The code continues to process the queue until it is empty, and then it prints the result for the remainder 0.<｜end▁of▁sentence｜>
