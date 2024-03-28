import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03420 {

    public static int[] rdi() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        return new int[]{
                Integer.parseInt(tokenizer.nextToken()),
                Integer.parseInt(tokenizer.nextToken())};
    }

    public static void main(String[] args) throws IOException {
        int[] input = rdi();
        int N = input[0];
        int K = input[1];

        long s = 0;
        for (int b = K + 1; b <= N; b++) {
            long an = 0;
            long j = N / b;
            an = j * (b - K);
            if (N % b > 0) {
                long x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                long x2 = Math.min(N, (j + 1) * b - 1);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}