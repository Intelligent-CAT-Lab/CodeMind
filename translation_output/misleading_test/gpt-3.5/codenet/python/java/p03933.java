```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import org.apache.commons.math3.util.FastMath;

public class TriangleArea {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);

            double theta = Math.PI / N;

            double left = 0;
            double right = 4;
            for (int i = 0; i < 100; i++) {
                double x = (left + right) / 2;
                if (test(x, N, theta, K)) {
                    left = x;
                } else {
                    right = x;
                }
            }

            System.out.println(right);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean test(double x, int N, double theta, int K) {
        int cnt = 0;

        for (int A = 1; A < N - 1; A++) {
            double sA = FastMath.sin(A * theta);
            double diff = FastMath.acos(x / sA - FastMath.cos(A * theta)) / theta;
            if (Double.isNaN(diff)) {
                diff = -(N + N);
            }

            int upper = (int) Math.min(N - A - 1, (N - A + diff) / 2);
            int lower = (N - A) - upper;

            int count = Math.max(0, upper - lower + 1);
            cnt += count;
        }

        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}
```
