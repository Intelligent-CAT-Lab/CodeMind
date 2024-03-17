import java.util.*;

public class p03594 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        String[] l = {"R", "Y", "G", "B"};
        char[][] res = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            if (i / d % 2 == 0) {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[(j / d + 2) % 4].charAt(0);
                }
            } else {
                for (int j = 0; j < 1000; j++) {
                    res[i][j] = l[j / d % 4].charAt(0);
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