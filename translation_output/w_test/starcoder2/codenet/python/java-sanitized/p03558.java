import java.util.*;
public class p03558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<int[]> q = new ArrayDeque<>();
        Map<Integer, Integer> m = new HashMap<>();
        q.add(new int[]{1, 1});
        while (!q.isEmpty()) {
            int[] t = q.pollFirst();
            int n = t[0], s = t[1];
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.addFirst(new int[]{n * 10 % K, s});
            q.add(new int[]{(n + 1) % K, s + 1});
        }
        System.out.println(m.get(0));
    }
}