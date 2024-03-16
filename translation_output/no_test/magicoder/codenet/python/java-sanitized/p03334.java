import java.util.*;

public class p03334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        scanner.close();

        int n1 = judge(D1);
        int n2 = judge(D2);

        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (judge1(x, y, n1) && judge2(x, y, n2)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }

    private static int judge(int D) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        return n;
    }

    private static boolean judge1(int x, int y, int n) {
        return (x / n + y / n) % 2 == 0;
    }

    private static boolean judge2(int x, int y, int n) {
        return (x / n) % 2 == 0;
    }
}