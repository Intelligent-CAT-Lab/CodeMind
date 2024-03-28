import java.util.Scanner;

public class p03594 {
    public static void main(String[] args) {
        char[] colors = {'R', 'Y', 'G', 'B'};
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        char[][] res = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if ((i / d) % 2 == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = colors[(j / d + 2) % 4];
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = colors[j / d % 4];
                }
            }
        }
        char[][] ans = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }
        for (char[] row : ans) {
            System.out.println(new String(row));
        }
    }
}