import java.util.*;

public class p03560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        List<List<int[]>> edge = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 1; i < K; i++) {
            edge.get(i).add(new int[]{(i + 1) % K, 1});
            edge.get(i).add(new int[]{i * 10 % K, 0});
        }
        int[] dist = new int[K];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            if (dist[now[1]] < now[0]) {
                continue;
            }
            for (int[] next : edge.get(now[1])) {
                if (dist[next[0]] > dist[now[1]] + next[1]) {
                    dist[next[0]] = dist[now[1]] + next[1];
                    pq.add(new int[]{dist[next[0]], next[0]});
                }
            }
        }
        System.out.println(dist[0] + 1);
    }
}