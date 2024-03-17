<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the given Python code:

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= 9; i++) {
            queue.add(i);
        }
        for(int i = 0; i < K; i++) {
            int a = queue.poll();
            if(a % 10 != 0) {
                queue.add(a * 10 + a % 10 - 1);
            }
            queue.add(a * 10 + a % 10);
            if(a % 10 != 9) {
                queue.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It creates a queue of integers from 1 to 9, then removes the first element of the queue and adds to it new elements that are obtained by appending to the last digit of the removed element either -1, 0, or +1 (if the last digit is not already 0 or 9, respectively). This is done K times. The last removed element is then printed.
<|EOT|>
