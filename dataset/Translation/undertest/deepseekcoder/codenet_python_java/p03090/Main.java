import java.util.ArrayList;
import java.util.List;

public class p03090 {
    public static void main(String[] args) {
        int N = 3;

        List<Edge> edge;
        if (N % 2 == 0) {
            edge = new ArrayList<>();
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng)
                        continue;
                    edge.add(new Edge(s, t));
                }
            }
        } else {
            edge = new ArrayList<>();
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng)
                        continue;
                    edge.add(new Edge(s, t));
                }
            }
        }

        System.out.println(edge.size());
        for (Edge e : edge) {
            System.out.println(e.s + " " + e.t);
        }
    }

    static class Edge {
        int s, t;

        Edge(int s, int t) {
            this.s = s;
            this.t = t;
        }
    }
}