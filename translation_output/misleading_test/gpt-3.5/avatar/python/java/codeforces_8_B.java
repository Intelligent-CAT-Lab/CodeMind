```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        
        Set<Pair> coord = new HashSet<>();
        Pair temp = new Pair(0, 0);
        coord.add(new Pair(0, 0));

        for (char c : path.toCharArray()) {
            if (c == 'L') temp = new Pair(temp.x, temp.y - 1);
            else if (c == 'R') temp = new Pair(temp.x, temp.y + 1);
            else if (c == 'U') temp = new Pair(temp.x - 1, temp.y);
            else temp = new Pair(temp.x + 1, temp.y);

            if (coord.contains(temp)) {
                System.out.println("BUG");
                return;
            }

            coord.add(temp);
        }

        coord.remove(new Pair(0, 0));
        Deque<Pair> queue = new ArrayDeque<>();
        queue.offer(new Pair(0, 0));

        while (!queue.isEmpty()) {
            if (queue.size() > 1) {
                System.out.println("BUG");
                return;
            }

            Pair point = queue.poll();
            int i = point.x;
            int j = point.y;

            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] dir : directions) {
                int p = i + dir[0];
                int q = j + dir[1];

                Pair neighbor = new Pair(p, q);

                if (coord.contains(neighbor)) {
                    coord.remove(neighbor);
                    queue.offer(neighbor);
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
            return Objects.hash(x, y);
        }
    }
}
```
```
