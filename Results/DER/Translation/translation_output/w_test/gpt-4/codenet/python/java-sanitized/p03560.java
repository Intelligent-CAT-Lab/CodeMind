import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p03560 {

    static final int MAX = (int) 1e9;
    
    static class Edge {
        int node;
        int cost;

        Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        // Create an array of lists to store edges
        PriorityQueue<Edge>[] edge = new PriorityQueue[K];
        for (int i = 0; i < K; i++) {
            edge[i] = new PriorityQueue<>((e1, e2) -> e