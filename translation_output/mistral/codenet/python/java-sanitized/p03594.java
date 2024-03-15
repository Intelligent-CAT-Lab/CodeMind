import java.util.*;

public class p03594 {
    public static void main(String[] args) {
        String[] l = {"R", "Y", "G", "B"};
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int[][] res = new int[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if ((i / d) % 2 == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[(j / d + 2) % 4];
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[j / d % 4];
                }
            }
        }
        int[][] ans = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }
        for (int[] row : ans) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }
}