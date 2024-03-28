import java.util.Scanner;

public class p03933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double theta = Math.PI / N;
        double x = 0;
        double left = 0;
        double right = N;
        while (left < right) {
            x = (left + right) / 2;
            if (test(x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(x);
    }

    public static boolean test(double x) {
        double[] A = new double[N - 1];
        for (int i = 1; i < N - 1; i++) {
            A[i] = Math.sin(i * theta);
        }
        double sA = A[0];
        for (int i = 1; i < N - 1; i++) {
            sA *= A[i];
        }
        double diff = Math.acos((x / sA) - Math.cos(A[0] * theta)) / theta;
        for (int i = 1; i < N - 1; i++) {
            diff[i] = Math.acos((x / sA) - Math.cos(A[i] * theta)) / theta;
        }
        diff[diff.length - 1] = Double.NaN;
        int upper = (int) Math.min(N - A[0] - 1, (N - A[0] + diff[0]) / 2);
        int lower = N - A[0] - upper;
        int cnt = (int) Math.max(0, upper - lower + 1);
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}