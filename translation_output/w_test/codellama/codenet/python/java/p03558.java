<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
This code uses a `Deque` to store the numbers and a `HashMap` to keep track of the numbers that have already been visited. It starts by adding the number 1 to the `Deque` and then iterates through the `Deque` until it is empty. For each number in the `Deque`, it checks if it has already been visited and if not, it adds it to the `HashMap` and adds its neighbors to the `Deque`. Finally, it prints the value of the number 0 in the `HashMap`.

Note that this code assumes that the input is a positive integer, and it will throw an exception if the input is not a valid integer.</s>
