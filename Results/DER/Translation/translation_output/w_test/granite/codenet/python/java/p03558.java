System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Queue<int[]> queue = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        queue.add(new int[]{1, 1});
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int n = poll[0];
            int s = poll[1];
            if (map.containsKey(n)) {
                continue;
            }
            map.put(n, s);
            queue.add(new int[]{n * 10 % k, s});
            queue.add(new int[]{(n + 1) % k, s + 1});
        }
        System.out.println(map.get(0));
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"6"});
        assertEquals(3, Main.m.get(0));
    }

    @Test
    public void test2() {
        Main.main(new String[]{"10"});
        assertEquals(1, Main.m.get(0));
    }

    @Test
    public void test3() {
        Main.main(new String[]{"15"});
        assertEquals(6, Main.m.get(0));
    }
}
```<|endoftext|>
