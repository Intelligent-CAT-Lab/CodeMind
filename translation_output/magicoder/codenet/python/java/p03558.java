<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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

This Java code does the same thing as the Python code. It uses a `Deque` to simulate the queue data structure and a `Map` to store the results. The `Deque` is used to store pairs of integers, where the first integer is the remainder of the current number when divided by `K`, and the second integer is the current sum. The `Map` is used to store the results, where the key is the remainder and the value is the sum. The code continues to add pairs to the `Deque` and to the `Map` until the `Deque` is empty. Finally, it prints the value associated with the key `0` in the `Map`.<｜end▁of▁sentence｜>
