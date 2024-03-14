import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class p03558 {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 1));
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int n = p.n;
            int s = p.s;
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.add(new Pair(n * 10 % K, s));
            q.add(new Pair((n + 1) % K, s + 1));
        }
        System.out.println(m.get(0));
    }
}

class Pair {
    int n;
    int s;

    Pair(int n, int s) {
        this.n = n;
        this.s = s;
    }
}