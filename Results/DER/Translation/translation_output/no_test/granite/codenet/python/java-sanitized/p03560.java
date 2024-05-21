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
        int ans = dijkstra(1, 0, K);
        System.out.println(ans + 1);
    }

    public static int dijkstra(int fro, int to, int v) {
        int MAX = Integer.MAX_VALUE;
        int[] dist = new int[v];
        boolean[] check = new boolean[v];
        Arrays.fill(dist, MAX);
        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, fro});
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            if (check[now[1]]) {
                continue;
            }
            check[now[1]] = true;
            for (int[] next : edge.get(now[1])) {
                int nextDist = dist[now[1]] + next[1];
                if (nextDist < dist[next[0]]) {
                    dist[next[0]] = nextDist;
                    pq.add(new int[]{dist[next[0]], next[0]});
                }
            }
        }
        return dist[to];
    }
}