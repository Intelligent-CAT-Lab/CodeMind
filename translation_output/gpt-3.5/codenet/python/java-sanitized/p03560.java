import java.util.*;

public class p03560 {

    static int[] dijkstra(int fro, int to, int v, List<List<int[]>> edge) {
        int MAX = (int) 1e9;
        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        Arrays.fill(dist, MAX);
        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, fro});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currNode = curr[1];

            if (check[currNode]) continue;

            check[currNode] = true;

            for (int[] next : edge.get(currNode)) {
                int nextNode = next[0];
                int cost = next[1];

                int newDist = dist[currNode] + cost;

                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    pq.offer(new int[]{dist[nextNode], nextNode});
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        List<List<int[]>> edge = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 1; i < K; i++) {
            edge.get(i).add(new int[]{(i + 1) % K, 1});
            edge.get(i).add(new int[]{(i * 10) % K, 0});
        }

        int[] distances = dijkstra(1, 0, K, edge);

        System.out.println(distances[0] + 1);
    }
}