import java.util.*;

public class p03334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (judge(D1, x, y) && judge(D2, x, y)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
        }
    }

    public static int judge(int D, int x, int y) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        int h1 = (x / n + y / n) % 2 == 0 ? 1 : 0;
        int h2 = (x / n) % 2 == 0 ? 1 : 0;
        return D % 2 == 1 ? h1 : h2;
    }
}