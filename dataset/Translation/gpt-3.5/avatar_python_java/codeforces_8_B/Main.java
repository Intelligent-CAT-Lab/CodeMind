import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<Pair> coord = new HashSet<>();
        Pair temp = new Pair(0, 0);

        for (char c : path.toCharArray()) {
            if (c == 'L') temp = new Pair(temp.i, temp.j - 1);
            else if (c == 'R') temp = new Pair(temp.i, temp.j + 1);
            else if (c == 'U') temp = new Pair(temp.i - 1, temp.j);
            else temp = new Pair(temp.i + 1, temp.j);

            if (coord.contains(temp)) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove(new Pair(0, 0));
        Deque<Pair> que = new LinkedList<>();
        que.add(new Pair(0, 0));

        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            Pair curr = que.poll();
            int i = curr.i;
            int j = curr.j;

            Pair[] neighbors = {new Pair(i + 1, j), new Pair(i - 1, j), new Pair(i, j + 1), new Pair(i, j - 1)};
            for (Pair neighbor : neighbors) {
                if (coord.contains(neighbor)) {
                    coord.remove(neighbor);
                    que.add(neighbor);
                }
            }
        }
        System.out.println("OK");
    }

    static class Pair {
        int i, j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return i == pair.i && j == pair.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}