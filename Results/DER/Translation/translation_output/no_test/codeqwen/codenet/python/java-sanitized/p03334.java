import java.util.Arrays;
import java.util.stream.IntStream;

public class p03334 {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int D1 = Integer.parseInt(input[1]);
        int D2 = Integer.parseInt(input[2]);

        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }

        boolean h1(int x, int y) {
            return ~(x / n + y / n) % 2 == 0;
        }

        boolean h2(int x, int y) {
            return ~(x / n) % 2 == 0;
        }

        boolean j1 = h1(D1);
        boolean j2 = h2(D2);

        int cnt = 0;
        for (int x : IntStream.range(0, N * 2).toArray()) {
            for (int y : IntStream.range(0, N * 2).toArray()) {
                if (j1 && j2) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }
}