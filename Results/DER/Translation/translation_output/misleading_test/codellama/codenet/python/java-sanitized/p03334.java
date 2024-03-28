import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class p03334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();

        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }

        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (judge(x, y, n, D1) && judge(x, y, n, D2)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }

    private static boolean judge(int x, int y, int n, int D) {
        if (D % 2 == 1) {
            return ~(x / n + y / n) % 2 == 0;
        } else {
            return ~(x / n) % 2 == 0;
        }
    }
}