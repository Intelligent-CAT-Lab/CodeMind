import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.awt.Point;

public class codeforces_8_B {
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