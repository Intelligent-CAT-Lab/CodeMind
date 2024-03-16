import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] answer = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = 0;
                    } else {
                        answer[i][j] = 1;
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = 1;
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.print(Arrays.toString(answer[i]));
        }
    }
}