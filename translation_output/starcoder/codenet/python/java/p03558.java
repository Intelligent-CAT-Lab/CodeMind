<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 1));
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int n = p.n;
            int s = p.s;
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.add(new Pair(n * 10 % K, s));
            q.add(new Pair((n + 1) % K, s + 1));
        }
        System.out.println(m.get(0));
    }
}

class Pair {
    int n;
    int s;

    Pair(int n, int s) {
        this.n = n;
        this.s = s;
    }
}
```
<|endoftext|>
