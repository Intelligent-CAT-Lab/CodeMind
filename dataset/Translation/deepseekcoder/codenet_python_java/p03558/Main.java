import java.util.*;

public class p03558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{1, 1});
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int[] pair = q.pollFirst();
            int n = pair[0], s = pair[1];
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.addFirst(new int[]{n * 10 % K, s});
            q.add(new int[]{ (n + 1) % K, s + 1});
        }
        System.out.println(m.get(0));
    }
}