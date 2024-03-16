import java.util.Scanner;

public class p03933 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        double theta = Math.PI / N;
        
        for (int i = 0; i < 100; i++) {
            double left = 0;
            double right = 4;
            double x = 0;
            for (int j = 0; j < 100; j++) {
                x = (left + right) / 2;
                if (test(N, theta, x, K)) {
                    left = x;
                } else {
                    right = x;
                }
            }
            System.out.println(x);
        }
        
        scanner.close();
    }
    
    private static boolean test(int N, double theta, double x, int K) {
        double[] A = new double[N-1];
        for (int i = 0; i < N-1; i++) {
            A[i] = i + 1;
        }
        
        double[] sA = new double[N-1];
        for (int i = 0; i < N-1; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        
        double[] diff = new double[N-1];
        for (int i = 0; i < N-1; i++) {
            double tmp = x / sA[i] - Math.cos(A[i] * theta);
            if (tmp <= 1 && tmp >= -1) {
                diff[i] = Math.acos(tmp) / theta;
            } else {
                diff[i] = -(N + N);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < N-1; i++) {
            int upper = Math.min(N - (int)A[i] - 1, (N - (int)A[i] + (int)diff[i]) / 2);
            int lower = (N - (int)A[i]) - upper;
            sum += Math.max(0, upper - lower + 1);
        }
        
        return N * ((N - 1) * (N - 2) / 2 - sum) < 3 * K;
    }
}