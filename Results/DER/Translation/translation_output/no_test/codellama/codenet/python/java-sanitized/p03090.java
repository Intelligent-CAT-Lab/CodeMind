import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            int[] edge = new int[N * (N - 1) / 2];
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[s * (N - s + 1) / 2 + t - 1] = s;
                }
            }
        } else {
            int[] edge = new int[N * (N - 1) / 2];
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[s * (N - s + 1) / 2 + t - 1] = s;
                }
            }
        }

        System.out.println(edge.length);
        for (int i = 0; i < edge.length; i++) {
            System.out.println(edge[i]);
        }
    }
}