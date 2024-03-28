import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] edge = new int[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    edge[i][j] = 0;
                } else {
                    edge[i][j] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (edge[i][j] == 1) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}