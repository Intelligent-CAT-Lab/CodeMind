Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> q = new LinkedList<>();
        q.offer(1);
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int n = q.poll();
            if (m.containsKey(n)) continue;
            m.put(n, 1);
            q.offer(n * 10 % K);
            q.offer((n + 1) % K);
        }
        System.out.println(m.get(0));
    }
}
```<|endoftext|>
