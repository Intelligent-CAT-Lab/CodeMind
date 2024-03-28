Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        que.offer(2);
        que.offer(3);
        que.offer(4);
        que.offer(5);
        que.offer(6);
        que.offer(7);
        que.offer(8);
        que.offer(9);
        for (int i = 0; i < K; i++) {
            int a = que.poll();
            if (a % 10!= 0) {
                que.offer(a * 10 + a % 10 - 1);
            }
            que.offer(a * 10 + a % 10);
            if (a % 10!= 9) {
                que.offer(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(a);
    }
}
```<|endoftext|>
