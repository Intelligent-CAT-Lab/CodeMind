import java.util.*;

public class p03394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            P2[i][2] = 2;
        }
        for (int i = 0; i < 2500; i++) {
            P3[i] = new int[]{12 * i + 3, 12 * i + 9};
        }
        if (N == 3) {
            System.out.println(2, 3, 25);
        } else if (N == 4) {
            System.out.println(2, 3, 4, 9);
        } else if (N == 6) {
            System.out.println(2, 3, 4, 6, 9, 12);
        } else {
            int[][] P = SP(N);
            for (int[] p : P) {
                System.out.print(Arrays.toString(p) + " ");
            }
        }
    }

    public static int[][] SP(int N) {
        if (N == 19999) {
            int[][] P = new int[5000][3];
            for (int i = 0; i < 5000; i++) {
                P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
            P[4999] = new int[]{2, 3, 25};
            return P;
        }
        int k = (N - 12500) / 3;
        N -= 3 * k;
        int m = N % 5;
        int[][] P = new int[5000][3];
        for (int i = 0; i < k + k + 1; i++) {
            P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            if (i == k) {
                P[i][2] = 2;
            }
        }
        if (m == 0) {
            for (int i = 0; i < k + 1; i++) {
                P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
        } else if (m == 1) {
            for (int i = 0; i < k + 2; i++) {
                P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
        } else if (m == 2) {
            for (int i = 0; i < k + 1; i++) {
                P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
        } else if (m == 3) {
            for (int i = 0; i < k + 1; i++) {
                P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
        } else if (k >= 2499) {
            for (int i = 0; i < k + 2; i++) {
                P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
        } else {
            for (int i = 0; i < k + 1; i++) {
                P[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
            }
        }
        return P;
    }
}