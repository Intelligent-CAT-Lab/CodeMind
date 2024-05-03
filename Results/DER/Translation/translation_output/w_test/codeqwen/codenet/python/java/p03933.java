Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        double theta = Math.PI / N;

        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, N, K, theta)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(String.format("%.10f", left));
    }

    public static boolean test(double x, int N, int K, double theta) {
        double[] A = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            A[i] = i + 1;
        }
        double[] sA = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        double[] diff = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
            if (Double.isNaN(diff[i])) {
                diff[i] = -(N + N);
            }
        }
        double[] upper = new double[N - 2];
        double[] lower = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            upper[i] = Math.min(N - A[i] - 1, (N - A
