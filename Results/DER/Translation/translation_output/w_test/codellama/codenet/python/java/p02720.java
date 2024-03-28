<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
23


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
```
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
        System.out.println(que.getFirst());
    }
}
```
This code uses the `Deque` interface from the `java.util` package to implement a queue data structure. The `LinkedList` class is used to implement the `Deque` interface.

The code first initializes the queue with the numbers 1 to 9. Then, it iterates `K` times, popping the first element from the queue and adding three new elements to the end of the queue based on the value of the popped element. The new elements are the original element multiplied by 10, plus the original element's remainder when divided by 10, minus 1, the original element multiplied by 10, plus the original element's remainder when divided by 10, and the original element multiplied by 10, plus the original element's remainder when divided by 10, plus 1.

Finally, the code prints the first element of the queue, which is the last element added to the queue.

Note that this code assumes that the input `K` is a positive integer. If `K` is not a positive integer, the code will throw a `NumberFormatException`.</s>
