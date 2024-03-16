```java
import java.util.ArrayDeque;
import java.util.Deque;

public class NumberSequence {
    public static void main(String[] args) {
        int K = 15;
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= 9; i++) {
            queue.offer(i);
        }
        
        int result = 0;
        for (int i = 0; i < K; i++) {
            int a = queue.poll();
            if (a % 10 != 0) {
                queue.offer(a * 10 + a % 10 - 1);
            }
            queue.offer(a * 10 + a % 10);
            if (a % 10 != 9) {
                queue.offer(a * 10 + a % 10 + 1);
            }
            result = a;
        }
        
        System.out.println(result);
    }
}
```
