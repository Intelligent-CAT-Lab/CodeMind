System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Queue<Integer> que = new ArrayDeque<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        que.add(7);
        que.add(8);
        que.add(9);
        for (int i = 0; i < K; i++) {
            int a = que.poll();
            if (a % 10!= 0) {
                que.add(a * 10 + a % 10 - 1);
            }
            que.add(a * 10 + a % 10);
            if (a % 10!= 9) {
                que.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(que.peek());
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"15"});
        assertEquals(-48, Main.que.peek());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"10"});
        assertEquals(-45, Main.que.peek());
    }

    @Test
    public void test3() {
        Main.main(new String[]{"5"});
        assertEquals(-45, Main.que.peek());
    }
}
```<|endoftext|>
