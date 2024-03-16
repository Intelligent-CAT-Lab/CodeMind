import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        List<Edge> edges = new ArrayList<>();
        int length = (int)(Math.log(L) / Math.log(2)) + 1;
        for (int i = 1; i < length; i++) {
            edges.add(new Edge(i, i + 1, 1 << (i - 1)));
            edges.add(new Edge(i, i + 1, 0));
        }

        for (int i = 0; i < length - 1; i++) {
            if (((L >> i) & 1) == 1) {
                L -= (1 << i);
                edges.add(new Edge(i + 1, length, L));
            }
        }

        System.out.println(length + " " + edges.size());
        for (Edge edge : edges) {
            System.out.println(edge);
        }

        scanner.close();
    }

    static class Edge {
        int u, v, w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return u + " " + v + " " + w;
        }
    }
}