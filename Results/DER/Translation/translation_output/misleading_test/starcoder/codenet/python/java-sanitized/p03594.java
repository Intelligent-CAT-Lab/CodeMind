import java.util.*;
public class p03594 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        String[] l = {"R", "Y", "G", "B"};
        String[][] res = new String[1000][1000];
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
        String[][] ans = new String[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}