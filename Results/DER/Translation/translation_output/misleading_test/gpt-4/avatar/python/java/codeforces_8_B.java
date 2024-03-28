Here is the translation of the provided Python code into Java. I'll include the Java code for the main functionality as well as handling user input and output, which are typically done differently in Java compared to Python.

```java
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class BugFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine().replace(" ", ""); // Remove spaces
        scanner.close();

        Set<Pair> coord = new HashSet<>();
        Pair temp = new Pair(0, 0);
        coord.add(temp);

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'L':
                    temp = new Pair(temp.x, temp.y - 1);
                    break;
                case 'R':
                    temp = new Pair(temp.x, temp.y + 1);
                    break;
                case 'U':
                    temp = new Pair(temp.x - 1, temp.y);
                    break;
                case 'D':
                    temp = new Pair(temp.x + 1, temp.y);
                    break;
            }
            if (coord.contains(temp)) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove(new Pair(0, 0));

        LinkedList<Pair> que = new LinkedList<>();
        que.add(new Pair(0, 0));
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            Pair current = que.poll();
            int i = current.x;
            int j = current.y;
            int[][] deltas = {{i + 1, j}, {i - 1, j}, {i, j + 1}, {i, j - 1}};
            for (int[] delta : deltas) {
                Pair next = new Pair(delta[0], delta[1]);
                if (coord.contains(next)) {
                    coord.remove(next);
                    que.add(next);
                }
            }
        }
        System.out.println("OK");
    }

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
}
```

Please note a few key differences between Python and Java:
- Java is strongly typed, so we need to define the type of each variable.
- In Java, we create a `Scanner` object to handle user input.
- The `Pair` class is created to replace the tuple used in Python; Java does not have a built-in tuple class.
- The `Set` interface is used, and for its implementation, we chose `HashSet` to keep unique points.
- The `equals` and `hashCode` methods are overridden in the `Pair` class to allow correct comparisons and hashing within the `HashSet`.
- Java does not have a direct equivalent to Python's `deque`, but `LinkedList` in Java can be used similarly for a queue.
- Java has a `switch` statement that can replace the series of `if-elif-else` statements for checking characters.
