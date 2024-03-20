import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<Tuple> coord = new HashSet<>();
        coord.add(new Tuple(0, 0));
        Tuple temp = new Tuple(0, 0);
        for (char c : path.toCharArray()) {
            if (c == 'L') {
                temp = new Tuple(temp.x, temp.y - 1);
            } else if (c == 'R') {
                temp = new Tuple(temp.x, temp.y + 1);
            } else if (c == 'U') {
                temp = new Tuple(temp.x - 1, temp.y);
            } else {
                temp = new Tuple(temp.x + 1, temp.y);
            }
            if (coord.contains(temp)) {
                System.out.println(" BUG ");
                return;
            }
            coord.add(temp);
        }
        coord.remove(new Tuple(0, 0));
        Queue<Tuple> que = new LinkedList<>();
        que.offer(new Tuple(0, 0));
        while (!que.isEmpty()) {
            Tuple t = que.poll();
            if (coord.size() > 1) {
                System.out.println(" BUG ");
                return;
            }
            for (Tuple p : new Tuple[]{new Tuple(t.x + 1, t.y), new Tuple(t.x - 1, t.y), new Tuple(t.x, t.y + 1), new Tuple(t.x, t.y - 1)}) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.offer(p);
                }
            }
        }
        System.out.println(" OK ");
    }
}

class Tuple {
    int x, y;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return x == tuple.x && y == tuple.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}