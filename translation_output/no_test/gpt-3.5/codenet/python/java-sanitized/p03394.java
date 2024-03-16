import java.util.Scanner;

public class p03394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        int limit = 30000;

        for (int i = 0; i < 5000; i++) {
            P2[i][0] = 6 * (i + 1) - 2;
            P2[i][1] = 6 * (i + 1);
            P2[i][2] = 6 * (i + 1) + 2;
        }
        P2[4999][2] = 2;

        for (int i = 0; i < 2500; i++) {
            P3[i][0] = 12 * i + 3;
            P3[i][1] = 12 * i + 9;
        }

        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            int[][] P = SP(N, P2, P3);
            StringBuilder sb = new StringBuilder();
            for (int[] p : P) {
                for (int _p : p) {
                    sb.append(_p).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }

    public static int[][] SP(int N, int[][] P2, int[][] P3) {
        if (N == 19999) {
            int[][] P = new int[P2.length + P3.length][2];
            P[0][0] = 4;
            P[0][1] = 8;
            return P;
        }

        int[][] P;
        int _k = -(-Math.max(N - 12500, 0) / 3);
        N -= 3 * _k;

        int k = N / 5;
        int m = N % 5;

        if (m == 0) {
            P = new int[k + _k + P3.length][2];
            System.arraycopy(P2, 0, P, 0, k + _k);
            System.arraycopy(P3, 0, P, k + _k, k);
        } else if (m == 1) {
            P = new int[k + 1 + _k + P3.length][2];
            System.arraycopy(P2, 0, P, 0, k + 1 + _k);
            System.arraycopy(P3, 0, P, k - 1, k);
        } else if (m == 2) {
            P = new int[k + _k + 1 + P3.length][2];
            System.arraycopy(P2, 0, P, 0, k + _k);
            System.arraycopy(P3, 0, P, k + 1, k);
        } else if (m == 3) {
            P = new int[k + 1 + _k + P3.length][2];
            System.arraycopy(P2, 0, P, 0, k + 1 + _k);
            System.arraycopy(P3, 0, P, k, k);
        } else if (k >= 2499) {
            P = new int[k + 2 + _k + P3.length][2];
            System.arraycopy(P2, 0, P, 0, k + 2 + _k);
            System.arraycopy(P3, 0, P, k - 1, k);
        } else {
            P = new int[k + _k + 2 + P3.length][2];
            System.arraycopy(P2, 0, P, 0, k + _k);
            System.arraycopy(P3, 0, P, k + 2, k);
        }

        return P;
    }
}