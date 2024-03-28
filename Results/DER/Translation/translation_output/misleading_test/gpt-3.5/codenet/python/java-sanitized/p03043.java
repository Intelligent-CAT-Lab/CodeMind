import java.util.Scanner;

public class p03043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        double s = 0.0;
        if (N >= K) {
            s += (double)(N - K) / N;
            double d = 0.0;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d += Math.pow(0.5, Math.ceil(a)) * 0.5 / N;
            }
            System.out.println(s + d);
        } else {
            double d = 0.0;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d += Math.pow(0.5, Math.ceil(a)) * 0.5 / N;
            }
            System.out.println(d);
        }
    }
}