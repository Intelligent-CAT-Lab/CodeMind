import java.util.Scanner;

public class p03594 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int w = in.nextInt();
        int d = in.nextInt();
        
        char[][] res = new char[1000][1000];
        char[] l = {'R', 'Y', 'G', 'B'};

        for (int i = 0; i < 1000; ++i) {
            if ((i / d) % 2 == 0) {
                for (int j = 0; j < 1000; ++j) {
                    res[i][j] = l[(j / d + 2) % 4];
                }
            } else {
                for (int j = 0; j < 1000; ++j) {
                    res[i][j] = l[j / d % 4];
                }
            }
        }

        char[][] ans = new char[h][w];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                ans[i][j] = res[i + j][h - i - 1 + j];
            }
        }

        for (char[] row : ans) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        
        in.close();
    }
}