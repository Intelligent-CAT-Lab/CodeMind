import java.util.*;
public class p03558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        Deque<Integer> q = new LinkedList<>();
        q.add(1);
        while (!q.isEmpty()) {
            int n = q.poll();
            if (m.containsKey(n)) continue;
            m.put(n, 1);
            q.addFirst((n * 10) % K);
            q.addLast(((n + 1) % K));
        }
        System.out.println(m.get(0));
    }
}