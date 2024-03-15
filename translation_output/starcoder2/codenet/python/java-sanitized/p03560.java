import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p03560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        List<List<Pair>> edge = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 1; i < K; i++) {
            edge.get(i).add(new Pair((i + 1) % K, 1));
            edge.get(i).add(new Pair((i * 10) % K, 0));
        }
        int dijkstra(int fro, int to, int v) {
            int MAX = (int) 1e9;
            int[] dist = new int[v];
            boolean[] check = new boolean[v];
            for (int i = 0; i < v; i++) {
                dist[i] = MAX;
            }
            dist[fro] = 0;
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            pq.add(new Pair(0, fro));
            for (int i = 0; i < v; i++) {
                int nowNode = -1;
                while (true) {
                    nowNode = pq.poll().node;
                    if (!check[nowNode]) {
                        check[nowNode] = true;
                        break;
                    }
                }
                for (Pair p : edge.get(nowNode)) {
                    int nextNode = p.node;
                    int cost = p.cost;
                    int nextDist = dist[nowNode] + cost;
                    if (nextDist < dist[nextNode]) {
                        dist[nextNode] = nextDist;
                        pq.add(new Pair(dist[nextNode], nextNode));
                    }
                }
            }
            return dist[to];
        }
        System.out.println(dijkstra(1, 0, K) + 1);
    }
}

class Pair implements Comparable<Pair> {
    int cost;
    int node;

    Pair(int cost, int node) {
        this.cost = cost;
        this.node = node;
    }

    @Override
    public int compareTo(Pair o) {
        return this.cost - o.cost;
    }
}