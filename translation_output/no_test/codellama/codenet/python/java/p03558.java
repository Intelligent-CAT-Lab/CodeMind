<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        HashMap<Integer, Integer> m = new HashMap<>();
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
This is the Java code equivalent to the Python code you provided. It uses the `Deque` class from the `java.util` package to implement a queue, and the `HashMap` class from the `java.util` package to implement a hash map. The `Scanner` class from the `java.util` package is used to read input from the user.

The code first reads an integer `K` from the user, and then initializes a queue `q` with the value `1`. It also initializes an empty hash map `m`.

The code then enters a loop that continues until the queue `q` is empty. In each iteration, it removes the first element from the queue `q` and assigns it to the variable `n`. If `n` is already in the hash map `m`, the code skips to the next iteration. Otherwise, it adds `n` to the hash map `m` with the value `1`.

The code then adds the value `n * 10 % K` to the front of the queue `q`, and the value `n + 1` to the back of the queue `q`.

Finally, the code prints the value of the hash map `m` at the key `0`.

Note that the code uses the `%` operator to compute the remainder of the division of `n * 10` by `K`, which is equivalent to the Python code `n * 10 % K`.</s>
