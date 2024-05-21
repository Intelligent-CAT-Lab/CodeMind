import java.util.*;

public class p03334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int n1 = 1;
        int n2 = 1;
        while (D1 % 4 == 0) {
            D1 /= 4;
            n1 *= 2;
        }
        while (D2 % 4 == 0) {
            D2 /= 4;
            n2 *= 2;
        }
        int[] x = new int[N * N];
        int[] y = new int[N * N];
        int cnt = 0;
        for (int i = 0; i < N * 2; i++) {
            for (int j = 0; j < N * 2; j++) {
                if (D1 % 2 == 1) {
                    if ((i / n1 + j / n1) % 2 == 0) {
                        x[cnt] = i;
                        y[cnt] = j;
                        cnt++;
                        if (cnt >= N * N) {
                            break;
                        }
                    }
                } else {
                    if (i / n1 % 2 == 0) {
                        x[cnt] = i;
                        y[cnt] = j;
                        cnt++;
                        if (cnt >= N * N) {
                            break;
                        }
                    }
                }
            }
            if (cnt >= N * N) {
                break;
            }
        }
        for (int i = 0; i < N * N; i++) {
            System.out.println(x[i] + " " + y[i]);
        }
    }
}