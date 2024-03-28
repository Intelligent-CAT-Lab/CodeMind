import java.util.Scanner;

public class p02792 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                num[i / 10][i % 10]++;
            }
        }

        int c = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }

        System.out.println(c);
    }
}