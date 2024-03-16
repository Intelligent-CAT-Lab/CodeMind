<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

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
        System.out.println(que.removeFirst());
    }
}
```
This is the Java code equivalent to the Python code you provided. It uses the `Deque` interface from the `java.util` package to implement a queue, and the `LinkedList` class from the `java.util` package to implement the queue. The code is similar to the Python code, with the main differences being the use of `Deque` and `LinkedList` instead of `deque` and `list`, and the use of `Integer.parseInt()` to parse the input string as an integer.</s>
