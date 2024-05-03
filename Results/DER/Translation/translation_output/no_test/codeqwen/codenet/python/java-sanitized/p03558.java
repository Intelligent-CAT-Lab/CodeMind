import java.util.LinkedList;
import java.util.Queue;

public class p03558 {
    public static void main(String[] args) {
        Queue<int[]> q = new LinkedList<>();
        int K = Integer.parseInt(System.console().readLine());
        q.add(new int[]{1, 1});
        boolean[] m = new boolean[K];
        while (!q.isEmpty()) {
            int[] n = q.poll();
            if (m[n[0]]) continue;
            m[n[0]] = true;
            q.add(new int[]{(n[0] * 10) % K, n[1] + 1});
            q.add(new int[]{(n[0] + 1) % K, n[1] + 1});
        }
        System.out.println(m[0] ? 1 : 0);
    }
}