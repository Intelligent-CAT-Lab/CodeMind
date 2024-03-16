import java.util.*;
import java.io.*;

public class p03334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }
        while (D2 % 4 == 0) {
            n *= 2;
            D2 /= 4;
        }
        int[][] h = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                h[i][j] = (i + j) % 2;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (h[i % n][j % n] == 1 && h[(i + D1) % n][(j + D2) % n] == 1) {
                    System.out.println(i + " " + j);
                    cnt++;
                    if (cnt >= N * N) {
                        return;
                    }
                }
            }
        }
    }
}