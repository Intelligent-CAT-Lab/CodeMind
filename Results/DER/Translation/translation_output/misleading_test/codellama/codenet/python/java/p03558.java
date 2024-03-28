<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<Integer> q = new ArrayDeque<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        q.add(1);
        while (!q.isEmpty()) {
            int n = q.removeFirst();
            if (m.containsKey(n)) continue;
            m.put(n, 1);
            q.addFirst(n * 10 % K);
            q.add(n + 1);
        }
        System.out.println(m.get(0));
    }
}
```
This solution uses a `Deque` to store the numbers and a `HashMap` to keep track of the numbers that have already been processed. The `Deque` is used to keep track of the order in which the numbers are processed, while the `HashMap` is used to keep track of the numbers that have already been processed.

The solution starts by reading the input `K` from the user and initializing the `Deque` and `HashMap`. It then adds the number `1` to the `Deque` and starts the processing loop.

Inside the loop, the first number in the `Deque` is removed and stored in the variable `n`. If `n` is already in the `HashMap`, the loop continues to the next iteration. Otherwise, `n` is added to the `HashMap` with a value of `1`.

Next, the `Deque` is updated by adding the numbers `n * 10 % K` and `n + 1` to the front and back of the `Deque`, respectively. These numbers are added to the `Deque` in the order in which they are processed, which ensures that the numbers are processed in the correct order.

Finally, the solution prints the value of `m.get(0)` to the console, which is the value of the number `0` in the `HashMap`. This is the number that was added to the `HashMap` in the first iteration of the loop, and it represents the number of times that the number `0` was processed.

The solution uses the `ArrayDeque` class from the `java.util` package to implement the `Deque` data structure. The `HashMap` class from the `java.util` package is used to implement the `HashMap` data structure. The `Scanner` class from the `java.util` package is used to read the input from the user.</s>
