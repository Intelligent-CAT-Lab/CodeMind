Here is the Python code translated into Java, using Java's Deque interface and HashSet collections:

```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine().trim();
        scanner.close();

        Set<Point> coord = new HashSet<>();
        coord.add(new Point(0, 0));
        Point temp = new Point(0, 0);

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'L':
                    temp = new Point(temp.x, temp.y - 1);
                    break;
                case 'R':
                    temp = new Point(temp.x, temp.y + 1);
                    break;
                case 'U':
                    temp = new Point(temp.x - 1, temp.y);
                    break;
                case 'D':
                    temp = new Point(temp.x + 1, temp.y);
                    break;
                default:
                    // Handle unexpected characters
            }
            if (coord.contains(temp)) {
                System.out.println("BUG");
                return; // exit the program
            }
            coord.add(temp);
        }

        coord.remove(new Point(0, 0));
        Deque<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(0, 0));

        while (!queue.isEmpty()) {
            if (queue.size() > 1) {
                System.out.println("BUG");
                return; // exit the program
            }
            Point current = queue.poll();
            for (int[] dir : new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}) {
                Point next = new Point(current.x + dir[0], current.y + dir[1]);
                if (coord.contains(next)) {
                    coord.remove(next);
                    queue.offer(next);
                }
            }
        }

        System.out.println("OK");
    }
}
```

Please note that in this Java version:

1. I replaced the Python tuple with java.awt.Point, which represents points in a coordinate space.
2. I used Java's `HashSet` to represent the `set` from Python.
3. I translated the deque behavior using Java's `ArrayDeque`.
4. The implicit conversion between the characters 'L', 'R', 'U', 'D', and string was removed in the Java version, thus the `trim()` method is used.
5. In Java, the `switch` statement is used instead of the `elif` chains.
6. The Java `main` method includes scanner close to avoid resource leakage.
7. The `System.exit` calls are replaced with `return`, since we are in the `main` method a simple return will exit the program.
8. The `print` calls are replaced with `System.out.println`.
9. The Python `exit` function corresponds to System.exit in Java. However, since we're within the main method, a simple `return` is enough to terminate the program.
