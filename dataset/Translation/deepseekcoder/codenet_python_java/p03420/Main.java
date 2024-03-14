import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = input[0], K = input[1];

        long s = 0;
        for (int b = K + 1; b <= N; b++) {
            long an = 0;
            int j = N / b;
            an = j * (b - K);

            if (N % b > 0) {
                int x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                int x2 = Math.min(N, (j + 1) * b - 1);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}