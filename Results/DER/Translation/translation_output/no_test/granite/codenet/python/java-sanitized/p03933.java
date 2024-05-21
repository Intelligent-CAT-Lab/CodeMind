import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p03933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        double theta = Math.PI / N;
        double[] sA = new double[N-1];
        for (int i = 1; i < N-1; i++) {
            sA[i-1] = Math.sin(i * theta);
        }

        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            int cnt = 0;
            for (int a = 1; a < N-1; a++) {
                double cosA = Math.cos(a * theta);
                double cosB = (x / sA[a-1] - cosA) / Math.cos(theta);
                if (cosB <= 1 && cosB >= -1) {
                    double b = Math.acos(cosB);
                    double c = 2 * Math.PI - a * theta - b;
                    int upper = (int) Math.min(N-a-1, (N-a+Math.abs(b-c))/2);
                    int lower = (int) (N-a) - upper;
                    cnt += Math.max(0, upper - lower + 1);
                }
            }
            if (N * ((N-1)*(N-2)/2 - cnt) < 3 * K) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
    }
}