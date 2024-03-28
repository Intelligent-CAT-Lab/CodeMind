Below is the translation of your provided Python code to Java:

```java
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        LinkedList<Pair> queue = new LinkedList<>();
        queue.add(new Pair(1, 1));

        Map<Integer, Integer> m = new HashMap<>();
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int n = p.getFirst();
            int s = p.getSecond();

            if (m.containsKey(n)) continue;

            m.put(n, s);
            queue.addFirst(new Pair(n * 10 % K, s));
            queue.add(new Pair((n + 1) % K, s + 1));
        }

        System.out.println(m.get(0));

        scanner.close();
    }

    static class Pair {
        private final int first;
        private final int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}
```

This Java code imports necessary classes and defines a main method where it reads from standard input, creates a queue (LinkedList implementing Deque) to simulate Python's deque, and a HashMap to store the visited state and its associated value. It also defines an internal `Pair` class to hold the "n" and "s" values because Java doesn't have a native tuple type like Python.

The logic inside the while loop is a direct translation from the Python code, using Java's method names and syntax. At the end of the main method, it prints out the solution to the standard output.

Make sure to run this with a Java environment set up correctly, and it will produce the same output as the Python code for the given test input.
