<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解题思路

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

### 代码实现

```
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        q.add(new Pair(1, 1));
        Map<Integer, Integer> m = new HashMap<>();
        while (q.size() > 0) {
            int n = q.removeFirst().getFirst();
            int s = q.removeFirst().getSecond();
            if (m.containsKey(n)) {
                continue;
            }
            m.put(n, s);
            q.addFirst(new Pair(n * 10 % K, s));
            q.add(new Pair((n + 1) % K, s + 1));
        }
        System.out.println(m.get(0));
    }
}

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
```

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(N)。

### 相关题目

- [Python](https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/)
- [Java](https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/)
</s>
