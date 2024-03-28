Below is the translated Java code from the provided Python code. Note that in Java, you will typically need to create a class and place your method inside this class. In addition, Java does not have built-in tuple types like Python, so I used a simple class `Pair` to emulate that behavior.

```java
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.HashMap;

public class ModuloSequence {

    private static class Pair {
        int number;
        int steps;

        public Pair(int number, int steps) {
            this.number = number;
            this.steps = steps;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(1, 1));
        HashMap<Integer, Integer> m = new HashMap<>();

        while (!q.isEmpty()) {
            Pair current = q.poll();
            if (m.containsKey(current.number)) continue;
            m.put(current.number, current.steps);
            q.offerFirst(new Pair(current.number * 10 % K, current.steps));
            q.offer(new Pair((current.number + 1) % K, current.steps + 1));
        }
        
        System.out.println(m.get(0));
    }
}
```

Here's a brief explanation of the changes made:

1. Python's `collections.deque` has been replaced by Java's `ArrayDeque`.
2. In Java, I/O is typically handled by the `Scanner` class.
3. A `Pair` class is created to handle pairs of integers, analogous to Python's tuple.
4. The Python `dict` is replaced by Java's `HashMap`.
5. The Python `while len(q)` construct is replaced with `while (!q.isEmpty())`.
6. The `continue` keyword is used similarly in both languages to skip to the next iteration of the loop.
7. Java's `System.out.println` is used to print the result.
