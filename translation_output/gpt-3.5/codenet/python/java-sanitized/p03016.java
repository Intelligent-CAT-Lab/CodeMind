import java.util.Scanner;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class p03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int l = scanner.nextInt();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = scanner.nextLong();

        int first_d = String.valueOf(a).length();
        long tail = a + b * (l - 1);

        int lo = -1;
        RealMatrix state = new Array2DRowRealMatrix(new double[][] { {0, a % m, 1} });

        for (int d = first_d; d < 19; d++) {
            int hi = Math.min((int) ((Math.pow(10, d) - 1 - a) / b), l - 1);
            int cnt = hi - lo;

            RealMatrix coe = new Array2DRowRealMatrix(new double[][] {
                {Math.pow(10, d) % m, 0, 0},
                {1, 1, 0},
                {0, b % m, 1}
            });

            coe = expMatrix(coe, cnt, m);
            state = state.multiply(coe).scalarMultiply(1L).mod(m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println((long) state.getEntry(0, 0));
    }

    public static RealMatrix expMatrix(RealMatrix a, int e, long m) {
        RealMatrix r = new Array2DRowRealMatrix(new double[a.getRowDimension()][a.getColumnDimension()]);
        for (int i = 0; i < r.getRowDimension(); i++) {
            r.setEntry(i, i, 1);
        }
        RealMatrix t = a.copy();

        while (e > 0) {
            if (e % 2 == 1) {
                r = r.multiply(t).scalarMultiply(1L).mod(m);
            }
            t = t.multiply(t).scalarMultiply(1L).mod(m);
            e >>= 1;
        }

        return r;
    }
}