<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
-48

```
from collections import deque
K=int(input())
que=deque([1,2,3,4,5,6,7,8,9])
for i in range(K):
    a=que.popleft()
    if not a%10==0:
        que.append(a*10+a%10-1)
    que.append(a*10+a%10)
    if not a%10==9:
        que.append(a*10+a%10+1)
print(a)

```
[/INST]
```java
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        Deque<Integer> que = new LinkedList<>();
        for (int i = 1; i <= 9; i++) {
            que.add(i);
        }
        for (int i = 0; i < K; i++) {
            int a = que.removeFirst();
            if (a % 10 != 0) {
                que.add(a * 10 + a % 10 - 1);
            }
            que.add(a * 10 + a % 10);
            if (a % 10 != 9) {
                que.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(que.removeFirst());
    }
}
```
This code uses the `Deque` interface from the `java.util` package to implement a queue data structure. The `LinkedList` class is used to implement the `Deque` interface.

The code first initializes the queue with the numbers 1 to 9. It then iterates `K` times, popping the first element from the queue and adding three new elements to the end of the queue based on the value of the popped element. The new elements are calculated as follows:

* If the popped element is not divisible by 10, add `a * 10 + a % 10 - 1` to the end of the queue.
* Add `a * 10 + a % 10` to the end of the queue.
* If the popped element is not divisible by 10, add `a * 10 + a % 10 + 1` to the end of the queue.

Finally, the code prints the first element of the queue, which is the last element that was added to the queue.

Note that the code uses the `Integer.parseInt()` method to convert the input string to an integer, and the `args[0]` array to access the input string.</s>
