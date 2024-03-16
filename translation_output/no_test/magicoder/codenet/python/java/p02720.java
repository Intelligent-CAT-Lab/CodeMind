<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<Integer> que = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i = 0; i < K; i++) {
            int a = que.pollFirst();
            if (a % 10 != 0) {
                que.addLast(a * 10 + a % 10 - 1);
            }
            que.addLast(a * 10 + a % 10);
            if (a % 10 != 9) {
                que.addLast(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `K` from the standard input, creates a `Deque` with the numbers 1 to 9, and then performs the same operations as the Python code. The last number `a` is printed out at the end.<｜end▁of▁sentence｜>
