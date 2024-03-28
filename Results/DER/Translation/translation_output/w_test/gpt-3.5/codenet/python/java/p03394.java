```java
import java.util.Arrays;

public class PythonToJava {

    public static void main(String[] args) {
        int N = 3;
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

    static int[][] SP(int N, int[][] P2, int[][] P3) {
        if (N == 19999) {
            int[][] P = Arrays.copyOf(P2, P2.length + P3.length);
            P[0] = new int[]{4, 8};
            return P;
        }

        int _k = -(-Math.max(N - 12500, 0) / 3);
        N -= 3 * _k;
        int k = N / 5;
        int m = N % 5;
        int[][] P;

        if (m == 0) {
            P = Arrays.copyOf(P2, k + _k);
            System.arraycopy(P3, 0, P, k + _k, k);
        } else if (m == 1) {
            P = Arrays.copyOf(P2, k + 1 + _k);
            System.arraycopy(P3, 0, P, k + 1 + _k, k - 1);
        } else if (m == 2) {
            P = Arrays.copyOf(P2, k + _k);
            System.arraycopy(P3, 0, P, k + _k, k + 1);
        } else if (m == 3) {
            P = Arrays.copyOf(P2, k + 1 + _k);
            System.arraycopy(P3, 0, P, k + 1 + _k, k);
        } else if (k >= 2499) {
            P = Arrays.copyOf(P2, k + 2 + _k);
            System.arraycopy(P3, 0, P, k + 2 + _k, k - 1);
        } else {
            P = Arrays.copyOf(P2, k + _k);
            System.arraycopy(P3, 0, P, k + _k, k + 2);
        }

        return P;
    }
}
```
