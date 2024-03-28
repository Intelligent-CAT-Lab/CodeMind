import java.util.*;
import java.math.*;

public class p03043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double s = 0;
        if (N >= K) {
            s = s + (double) (N - K) / N;
            double d = 0;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, Math.ceil(a)) / N;
            }
            System.out.println(s + d);
        } else {
            double d = 0;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, Math.ceil(a)) / N;
            }
            System.out.println(s + d);
        }
    }
}

/docs/2019-2020/2019-10-16.md
# 2019-10-16