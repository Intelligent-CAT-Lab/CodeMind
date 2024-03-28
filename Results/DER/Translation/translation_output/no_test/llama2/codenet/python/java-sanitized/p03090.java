import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] edge = new int[N][N];
        if (N % 2 == 0) {
            for (int s = 1; s <= N; s++) {
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == N - s + 1) {
                        continue;
                    }
                    edge[s][t] = 1;
                }
            }
        } else {
            for (int s = 1; s <= N; s++) {
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == N - s) {
                        continue;
                    }
                    edge[s][t] = 1;
                }
            }
        }
        System.out.println(edge.length);
        for (int s = 0; s < N; s++) {
            for (int t = 0; t < N; t++) {
                if (edge[s][t] == 1) {
                    System.out.println(s + " " + t);
                }
            }
        }
    }
}