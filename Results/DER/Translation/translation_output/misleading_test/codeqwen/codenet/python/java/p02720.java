Here is the Java version of your Python code:

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int K = Integer.parseInt(System.console().readLine());
        Deque<Integer> que = new ArrayDeque<>();
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
```

This Java code does the same thing as your Python code. It reads an integer from the console, creates a queue of integers from 1 to 9, and then performs the same operations as your Python code. The result is printed to the console.
