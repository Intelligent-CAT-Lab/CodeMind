import java.util.PriorityQueue;

public class p03560 {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        int[][] edge = new int[K][2];

        for (int i = 1; i < K; i++) {
            edge[i][0] = (i + 1) % K;
            edge[i][1] = 1;
        }

        int[] dist = new int[K];
        boolean[] check = new boolean[K];

        dist[0] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);

        while (!pq.isEmpty()) {
            int nowNode = pq.poll();
            if (!check[nowNode]) {
                check[nowNode] = true;
                for (int i = 0; i < K; i++) {
                    int nextNode = edge[nowNode][i];
                    int nextDist = dist[nowNode] + edge[nowNode][i];
                    if (nextDist < dist[nextNode]) {
                        dist[nextNode] = nextDist;
                        pq.add(nextNode);
                    }
                }
            }
        }

        System.out.println(dist[K - 1] + 1);
    }
}