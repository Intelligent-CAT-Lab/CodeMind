import java.util.*;
import java.io.*;

public class p03257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = 1;
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (i % 2 == 0) {
                    A[i][j] *= i / 2;
                    A[i][j] *= (N - i) / 2;
                    A[i][j] *= A[i - 1][j];
                    A[i][j] *= A[i][j - 1];
                    A[i][j] += 1;
                } else {
                    A[i][j] *= (i + 1) / 2;
                    A[i][j] *= (N - i - 1) / 2;
                    A[i][j] *= A[i - 1][j];
                    A[i][j] *= A[i][j - 1];
                    A[i][j] += 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}