import java.util.Scanner;
import java.lang.Math;

public class p03043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double s = 0;
        if (N >= K) {
            s = s + (double)(N - K) / N;
            double d = 0;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, (int)Math.ceil(a)) / N;
            }
        } else {
            double d = 0;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, (int)Math.ceil(a)) / N;
            }
        }
        System.out.println(s + d);
    }
}