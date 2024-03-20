import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class p03558 {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        Deque<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(1);
        HashMap<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int n = q.poll();
            int s = m.getOrDefault(n, 0);
            if (s > 0) continue;
            m.put(n, s + 1);
            q.offer(n * 10 % K);
            q.offer((n + 1) % K);
        }
        System.out.println(m.get(0));
    }
}