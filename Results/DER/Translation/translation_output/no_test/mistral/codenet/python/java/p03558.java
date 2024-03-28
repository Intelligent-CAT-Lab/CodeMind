<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{1, 1});
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int[] n = q.poll();
            if (m.containsKey(n[0])) continue;
            m.put(n[0], n[1]);
            q.add(new int[]{n[1] * 10 % K, n[1]});
            q.add(new int[]{n[0] + 1 % K, n[1] + 1});
        }
        System.out.println(m.get(0));
    }
}
```</s>
