import java.util.*;

public class p03558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{1, 1});
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int[] n = q.poll();
            if (m.containsKey(n[0])) continue;
            m.put(n[0], n[1]);
            q.add(new int[]{n[1] * 10 % K, n[1]});
            q.add(new int[]{n[0] + 1 % K, n[1] + 1});
        }
        System.out.println(m.get(0));
    }
}