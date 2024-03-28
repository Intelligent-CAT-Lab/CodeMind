import java.util.*;

public class p03689 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                input[i][j] = sc.nextInt();
            }
        }
        int H = input[0][0];
        int W = input[0][1];
        int h = input[1][0];
        int w = input[1][1];
        if (H % h == 0 && W % w == 0) {
            System.out.println("No");
        } else if (W % w != 0) {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) {
                        System.out.print(" ");
                    }
                    if ((x % w) != (w - 1)) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (w - 1) - 1);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) {
                        System.out.print(" ");
                    }
                    if ((y % h) != (h - 1)) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (h - 1) - 1);
                    }
                }
                System.out.println();
            }
        }
    }
}