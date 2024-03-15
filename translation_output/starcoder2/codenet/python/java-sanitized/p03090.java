import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] edge = new int[N][N];
        int count = 0;
        for (int s = 1; s <= N; s++) {
            int ng = N - s + 1;
            for (int t = 1; t <= N; t++) {
                if (s >= t || t == ng) {
                    continue;
                }
                edge[s - 1][t - 1] = 1;
                count++;
            }
        }
        System.out.println(count);
        for (int s = 0; s < N; s++) {
            for (int t = 0; t < N; t++) {
                if (edge[s][t] == 1) {
                    System.out.println(s + 1 + " " + (t + 1));
                }
            }
        }
    }
}