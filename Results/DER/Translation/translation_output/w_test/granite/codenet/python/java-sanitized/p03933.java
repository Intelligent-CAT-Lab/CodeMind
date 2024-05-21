import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03933 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        double theta = Math.PI / N;
        double left = 0;
        double right = 4;

        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(N, theta, x)) {
                left = x;
            } else {
                right = x;
            }
        }

        System.out.println(left);
    }

    private static boolean test(int N, double theta, double x) {
        int[] A = new int[N - 2];
        for (int i = 1; i < N - 1; i++) {
            A[i - 1] = i;
        }

        double[] sA = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            sA[i] = Math.sin((A[i] + 1) * theta);
        }

        double[] diff = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            diff[i] = Math.acos((x / sA[i]) - Math.cos((A[i] + 1) * theta)) / theta;
            if (Double.isNaN(diff[i])) {
                diff[i] = -(N + N);
            }
        }

        int[] upper = new int[N - 2];
        int[] lower = new int[N - 2];
        for (int i = 0; i < N - 2; i++) {
            upper[i] = (int) Math.min(N - A[i] - 2, ((N - A[i] + diff[i]) / 2));
            lower[i] = (N - A[i]) - upper[i];
        }

        int cnt = 0;
        for (int i = 0; i < N - 2; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }

        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}