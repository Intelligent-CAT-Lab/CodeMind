<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
-56

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
        Queue<int[]> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        queue.add(new int[]{1, 1});
        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            int n = pair[0];
            int s = pair[1];
            if (map.containsKey(n)) continue;
            map.put(n, s);
            queue.add(new int[]{n * 10 % K, s});
            queue.add(new int[]{(n + 1) % K, s + 1});
        }
        System.out.println(map.get(0));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `K` from the standard input, then it uses a queue to perform a breadth-first search. It maintains a map to store the results of each number `n` modulo `K`. The queue starts with `(1, 1)`, and for each pair `(n, s)` in the queue, it adds `(n * 10 % K, s)` and `((n + 1) % K, s + 1)` to the queue. If `n` is already in the map, it skips the current iteration. Finally, it prints the result of `0` modulo `K`.<｜end▁of▁sentence｜>
