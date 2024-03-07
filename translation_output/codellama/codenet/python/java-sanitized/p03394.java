import java.util.Scanner;

public class p03394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
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
            int _k = -(-(N - 12500) / 3);
            N -= 3 * _k;
            int k = N / 5;
            int m = N % 5;
            if (m == 0) {
                int[][] P = new int[k + _k][3];
                for (int i = 0; i < k + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (m == 1) {
                int[][] P = new int[k + 1 + _k][3];
                for (int i = 0; i < k + 1 + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k - 1; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (m == 2) {
                int[][] P = new int[k + _k][3];
                for (int i = 0; i < k + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k + 1; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (m == 3) {
                int[][] P = new int[k + 1 + _k][3];
                for (int i = 0; i < k + 1 + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else if (k >= 2499) {
                int[][] P = new int[k + 2 + _k][3];
                for (int i = 0; i < k + 2 + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k - 1; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            } else {
                int[][] P = new int[k + _k][3];
                for (int i = 0; i < k + _k; i++) {
                    P[i][0] = P2[i][0];
                    P[i][1] = P2[i][1];
                    P[i][2] = P2[i][2];
                }
                for (int i = 0; i < k + 2; i++) {
                    P[i][0] = P3[i][0];
                    P[i][1] = P3[i][1];
                }
                System.out.println(P);
            }
        }
    }
}