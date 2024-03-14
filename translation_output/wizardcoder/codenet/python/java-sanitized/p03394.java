import java.util.*;

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
            System.out.println(2 + " " + 3 + " " + 25);
        } else if (N == 4) {
            System.out.println(2 + " " + 3 + " " + 4 + " " + 9);
        } else if (N == 6) {
            System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
        } else {
            int k = -(-(N - 12500) / 3);
            N -= 3 * k;
            int m = N % 5;
            int[][] P;
            if (m == 0) {
                P = Arrays.copyOfRange(P2, k, k + 1 + k);
                System.arraycopy(P3, 0, P, k, k);
            } else if (m == 1) {
                P = Arrays.copyOfRange(P2, k, k + 2 + k);
                System.arraycopy(P3, 0, P, k + 1, k - 1);
            } else if (m == 2) {
                P = Arrays.copyOfRange(P2, k, k + k);
                System.arraycopy(P3, 0, P, k, k + 1);
            } else if (m == 3) {
                P = Arrays.copyOfRange(P2, k, k + 2 + k);
                System.arraycopy(P3, 0, P, k, k);
            } else if (k >= 2499) {
                P = Arrays.copyOfRange(P2, k, k + 2 + k);
                System.arraycopy(P3, 0, P, k + 1, k - 1);
            } else {
                P = Arrays.copyOfRange(P2, k, k + k);
                System.arraycopy(P3, 0, P, k, k + 2);
            }
            for (int i = 0; i < P.length; i++) {
                for (int j = 0; j < P[i].length; j++) {
                    System.out.print(P[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}