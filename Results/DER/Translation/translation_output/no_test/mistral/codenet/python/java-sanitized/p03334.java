import java.util.Arrays;
import java.util.stream.IntStream;

public class p03334 {
    public static void main(String[] args) {
        int N = 10;
        int D1 = 12;
        int D2 = 16;
        int[] j1 = new int[N * N];
        int[] j2 = new int[N * N];
        Arrays.fill(j1, 0);
        Arrays.fill(j2, 0);
        int cnt = 0;
        for (int i = 0; i < N * N; i++) {
            int x = i / N;
            int y = i % N;
            if (j1[x * N + y] && j2[x * N + y]) {
                System.out.println(x * N + y);
                cnt++;
                if (cnt >= N * N) {
                    break;
                }
            }
        }
    }
}