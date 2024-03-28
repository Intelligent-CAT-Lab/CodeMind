import java.util.Scanner;

public class p03334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        scanner.close();

        int n1 = getN(D1);
        int n2 = getN(D2);

        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (judge(x, y, n1, D1) && judge(x, y, n2, D2)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }

    private static int getN(int D) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        return n;
    }

    private static boolean judge(int x, int y, int n, int D) {
        if (D % 2 == 1) {
            return (x / n + y / n) % 2 == 0;
        } else {
            return (x / n) % 2 == 0;
        }
    }
}