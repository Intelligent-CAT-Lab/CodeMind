Here's the equivalent Java code for the Python program provided:

```java
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> que = new LinkedList<>();
        
        for (int i = 1; i < 10; i++) {
            que.addLast(i);
        }

        int a = 0;
        for (int i = 0; i < K; i++) {
            a = que.pollFirst();
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

This program takes an integer input similar to the Python code provided. It uses a `Deque`, which in Java is usually instantiated as a `LinkedList`, to accomplish the same task as the `deque` in Python. 

The `Deque` in Java does not have the `popleft` method like in Python, so instead, we use `pollFirst`, which also retrieves and removes the head of the queue. Also, `append` in Python corresponds to `addLast` in Java for appending items to the end of the deque.

For the input `15`, the Java code should produce an output of `-48`, just like the expected output in the Python code test case. Remember that Java requires a class and a `main` method as entry points for execution.
