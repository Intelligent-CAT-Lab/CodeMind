import java.util.PriorityQueue;
import java.util.Scanner;

public class p03560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int[][] edge = new int[K][K];
        for (int i = 1; i < K; i++) {
            edge[i][(i+1)%K] = 1;
            edge[i][(i*10)%K] = 0;
        }

        int[] dist = new int[K];
        boolean[] check = new boolean[K];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        dist[1] = 0;
        pq.offer(new int[]{0, 1});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int nowNode = now[1];
            if (check[nowNode]) continue;
            check[nowNode] = true;

            for (int i = 0; i < K; i++) {
                if (edge[nowNode][i]!= 0) {
                    int nextDist = dist[nowNode] + edge[nowNode][i];
                    if (nextDist < dist[i]) {
                        dist[i] = nextDist;
                        pq.offer(new int[]{nextDist, i});
                    }
                }
            }
        }

        System.out.println(dist[0] + 1);
    }
}