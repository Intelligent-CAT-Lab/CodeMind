import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] edge = new int[N][N];

        if (N % 2 == 0) {
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[s - 1][t - 1] = 1;
                }
            }
        } else {
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[s - 1][t - 1] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (edge[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (edge[i][j] == 1) {
                    System.out.println(i + 1 + " " + (j + 1));
                }
            }
        }
    }
}