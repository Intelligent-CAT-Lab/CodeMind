import java.util.*;
public class p03558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int n = q.poll();
            if (m.containsKey(n)) continue;
            m.put(n, m.getOrDefault(n, 0) + 1);
            q.addFirst(n * 10 % K);
            q.add(n + 1 % K);
        }
        System.out.println(m.get(0));
    }
}