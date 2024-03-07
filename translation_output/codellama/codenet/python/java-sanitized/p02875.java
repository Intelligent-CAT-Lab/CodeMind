import java.util.Scanner;

public class p02875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int nn = N + 10;
        int P = 998244353;

        int[] fa = new int[nn + 1];
        int[] fainv = new int[nn + 1];
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = (fa[i] * (i + 1)) % P;
        }
        fainv[nn - 1] = (int) Math.pow(fa[nn - 1], P - 2, P);
        for (int i = nn - 2; i >= 0; i--) {
            fainv[i] = (fainv[i + 1] * (i + 1)) % P;
        }

        int ans = (int) Math.pow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * (int) Math.pow(2, N - i, P)) % P;
        }

        System.out.println(ans);
    }

    public static int C(int a, int b) {
        if (0 <= b && b <= a) {
            return (fa[a] * fainv[b] % P * fainv[a - b] % P);
        } else {
            return 0;
        }
    }
}