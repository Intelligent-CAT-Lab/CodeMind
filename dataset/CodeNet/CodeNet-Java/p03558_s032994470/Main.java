import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int k = in.nextInt();

            Vertex[] vertices = new Vertex[k];
            for (int i = 0; i < k; i++) vertices[i] = new Vertex(i);

            for (int i = 0; i < k; i++) {
                vertices[i].setEdge(vertices[(i * 10) % k], 0);
                vertices[i].setEdge(vertices[(i + 1) % k], 1);
            }

            out.println(Search.dijkstra(vertices[1], vertices[0]));
        }

    }

    static class Search {
        public static int dijkstra(Vertex start, Vertex goal) {
            Map<Vertex, Integer> minCost = new HashMap<>();
            minCost.put(start, 1);

            // queue for vertex and cost pair. ordered by cost
            Queue<Pair<Vertex, Integer>> q = new PriorityQueue<>(Comparator.comparing(Pair::getSecond));
            q.add(new Pair<>(start, 1));

            Set<Vertex> visited = new HashSet<>();
            // find path
            while (q.size() > 0) {
                // if it is not the shortest path, ignore it
                Pair<Vertex, Integer> p = q.poll();
                Vertex cv = p.getFirst();
                int cvCost = p.getSecond();
                if (cvCost > minCost.get(cv)) continue;

                if (cv == goal) return minCost.get(cv);  // found shortest path
                visited.add(cv);

                // see each connected edges
                for (int i = 0; i < cv.getDegree(); i++) {
                    Vertex nextV = cv.getEdge(i).getVertex();
                    if (visited.contains(nextV)) continue;

                    int cost = cvCost + cv.getEdge(i).getCost();
                    // if new cost is smaller, add new vertex
                    if (cost < minCost.getOrDefault(nextV, Integer.MAX_VALUE)) {
                        minCost.put(nextV, cost);
                        q.add(new Pair<>(nextV, cost));
                    }
                }
            }
            return -1;
        }

    }

    static class Edge {
        private Vertex vertex;
        private int cost;

        public Edge() {
        }

        public Edge(Vertex v) {
            this.vertex = v;
        }

        public Edge(Vertex v, int c) {
            this.vertex = v;
            this.cost = c;
        }

        public Vertex getVertex() {
            return this.vertex;
        }

        public int getCost() {
            return this.cost;
        }

    }

    static class Vertex {
        private int value;
        private List<Edge> edges = new ArrayList<Edge>();

        public Vertex() {
        }

        public Vertex(int v) {
            this.value = v;
        }

        public void setEdge(Vertex v, int cost) {
            this.edges.add(new Edge(v, cost));
        }

        public int getDegree() {
            return this.edges.size();
        }

        public Edge getEdge(int index) {
            return this.edges.get(index);
        }

    }

    static class Pair<A, B> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair<?, ?> pair = (Pair<?, ?>) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;
        }


        public int hashCode() {
            int firstH = (first != null) ? first.hashCode() : 0;
            int secondH = (second != null) ? second.hashCode() : 0;
            return (31 * firstH) + secondH;
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }

    }
}

