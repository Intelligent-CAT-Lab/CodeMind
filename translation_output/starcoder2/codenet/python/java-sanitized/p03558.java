import java.util.*;
public class p03558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 1});
        Map<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int n = p[0], s = p[1];
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.add(new int[]{n * 10 % K, s});
            q.add(new int[]{(n + 1) % K, s + 1});
        }
        System.out.println(m.get(0));
    }
}