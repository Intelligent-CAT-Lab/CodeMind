import java.util.*;

public class p03560 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        ArrayList<ArrayList<int[]>> edge = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 1; i < K; i++) {
            edge.get(i).add(new int[]{(i + 1) % K, 1});
            edge.get(i).add(new int[]{(i * 10) % K, 0});
        }

        System.out.println(dijkstra(1, 0, K, edge) + 1);
    }

    private static int dijkstra(int fro, int to, int v, ArrayList<ArrayList<int[]>> edge) {
        int MAX = (int) 1e9;

        int[] dist = new int[v];
        boolean[] check = new boolean[v];

        Arrays.fill(dist, MAX);

        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        pq.add(new int[]{0, fro});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int nowNode = now[1];

            if (check[nowNode]) {
                continue;
            }

            check[nowNode] = true;

            for (int[] next : edge.get(nowNode)) {
                int nextNode = next[0];
                int cost = next[1];

                int nextDist = dist[nowNode] + cost;
                if (nextDist < dist[nextNode]) {
                    dist[nextNode] = nextDist;
                    pq.add(new int[]{dist[nextNode], nextNode});
                }
            }
        }

        return dist[to];
    }
}