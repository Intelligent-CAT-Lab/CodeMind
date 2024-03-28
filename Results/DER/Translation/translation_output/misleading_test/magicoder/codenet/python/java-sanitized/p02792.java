import java.util.Scanner;

public class p02792 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] num = new int[10][10];

        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                String str = String.valueOf(i);
                num[Integer.parseInt(String.valueOf(str.charAt(0)))][i % 10] += 1;
            }
        }

        int c = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }
        System.out.println(c);
    }
}