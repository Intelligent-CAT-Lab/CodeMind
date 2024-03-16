import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.HashMap;

public class p03558 {

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