import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class p03558 {
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