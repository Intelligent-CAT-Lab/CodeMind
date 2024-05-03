import java.util.PriorityQueue;

public class p03560 {
    public static void main(String[] args) {
        int K = Integer.parseInt(System.console().readLine());

        int[][] edge = new int[K][2];  // (node, cost) list list

        for (int i = 1; i < K; i++) {
            edge[i][0] = (i + 1) % K;
            edge[i][1] = 1;
            edge[i][0] = (i * 10) % K;
            edge[i][1] = 0;
        }

        // fro ãã to ã¸ã®æç­è·é¢(v ã¯é ç¹æ°)
        System.out.println(dijkstra(1, 0, K) + 1);
    }

    public static int dijkstra(int fro, int to, int v) {
        int MAX = (int) 1e9;

        int[] dist = new int[v];   // fro ããã®è·é¢ãæ ¼ç´ãã
        boolean[] check = new boolean[v];  // ãã§ã«ãã®é ç¹ãããèª¿ã¹ããã®ãã©ã°

        dist[fro] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);    // (-cost, node)

        // é ç¹ã¯ v åããã®ã§ãv å¨ãã
        for (int i = 0; i < v; i++) {
            // èª¿ã¹æ¸ã¿ã§ãª