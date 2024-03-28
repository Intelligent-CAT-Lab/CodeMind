<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> que = new Deque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i = 0; i < K; i++) {
            int a = que.poll();
            if (a % 10 != 0) {
                que.add(a * 10 + a % 10 - 1);
            }
            que.add(a * 10 + a % 10);
            if (a % 10 != 9) {
                que.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(que.peek());
    }
}
```</s>
