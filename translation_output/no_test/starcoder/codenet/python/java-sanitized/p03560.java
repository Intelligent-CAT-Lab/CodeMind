import java.util.PriorityQueue;
import java.util.Scanner;

public class p03560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[][] edge = new int[K][2];
        for (int i = 1; i < K; i++) {
            edge[i][0] = (i + 1) % K;
            edge[i][1] = (i * 10) % K;
        }
        int[] dist = new int[K];
        boolean[] check = new boolean[K];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        dist[0] = 0;
        pq.add(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            if (!check[now[1]]) {
                check[now[1]] = true;
                break;
            }
            for (int[] next : edge) {
                int nextDist = dist[now[1]] + next[1];
                if (nextDist < dist[next[0]]) {
                    dist[next[0]] = nextDist;
                    pq.add(new int[]{dist[next[0]], next[0]});
                }
            }
        }
        System.out.println(dist[0] + 1);
    }
}