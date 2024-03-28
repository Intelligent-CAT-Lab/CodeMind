import java.util.*;

public class p03334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }
        int n2 = 1;
        while (D2 % 4 == 0) {
            n2 *= 2;
            D2 /= 4;
        }
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if ((x / n + y / n) % 2 == 0 && (x / n2) % 2 == 0) {
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