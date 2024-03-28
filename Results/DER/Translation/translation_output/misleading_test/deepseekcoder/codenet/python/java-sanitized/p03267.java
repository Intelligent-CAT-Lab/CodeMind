import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        List<Edge> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new Edge(i, i+1, (int)Math.pow(2, i-1)));
            edges.add(new Edge(i, i+1, 0));
        }
        for (int i = 0; i < length-1; i++) {
            if ((L & (1 << i)) != 0) {
                L -= (int)Math.pow(2, i);
                edges.add(new Edge(i+1, length, L));
            }
        }
        System.out.println(length + " " + edges.size());
        for (Edge edge : edges) {
            System.out.println(edge.from + " " + edge.to + " " + edge.weight);
        }
    }
}

class Edge {
    int from;
    int to;
    int weight;

    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}