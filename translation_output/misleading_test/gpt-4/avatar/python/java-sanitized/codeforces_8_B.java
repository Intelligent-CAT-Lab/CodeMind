import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class codeforces_8_B {
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