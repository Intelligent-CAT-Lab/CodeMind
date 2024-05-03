Here is the Java version of the provided Python code:

```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int K = Integer.parseInt(System.console().readLine());
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 1});
        boolean[] m = new boolean[K];
        while (!q.isEmpty()) {
            int[] n = q.poll();
            if (m[n[0]]) continue;
            m[n[0]] = true;
            q.add(new int[]{(n[0] * 10) % K, n[1] + 1});
            q.add(new int[]{(n[0] + 1) % K, n[1] + 1});
        }
        System.out.println(m[0] ? 1 : 0);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the console, creates a queue, and then enters a loop that continues until the queue is empty. In each iteration of the loop, it removes an element from the queue, checks if it has been visited before, and if not, it adds it to the queue and marks it as visited. The loop continues until the queue is empty, and then it prints the result.
