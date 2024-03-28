import java.util.*;

public class p03558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> q = new LinkedList<>();
        q.offer(1);
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int n = q.poll();
            if (m.containsKey(n)) continue;
            m.put(n, 1);
            q.offer(n * 10 % K);
            q.offer((n + 1) % K);
        }
        System.out.println(m.get(0));
    }
}