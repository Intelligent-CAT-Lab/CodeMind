import java.util.Scanner;

public class p02875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nn = N + 10;
        int P = 998244353;
        int[] fa = new int[nn + 1];
        int[] fainv = new int[nn + 1];
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = fa[i] * (i + 1) % P;
        }
        fainv[nn] = pow(fa[nn], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        }
        int C = (int) (fa[N] * fainv[N] % P * fainv[N - N] % P);
        int ans = (int) (pow(3, N, P) % P);
        for (int i = N / 2 + 1; i < N + 1; i++) {
            ans = (int) ((ans - 2 * C(N, i) * pow(2, N - i, P)) % P);
        }
        System.out.println(ans);
    }

    public static int C(int a, int b) {
        return (int) (fa[a] * fainv[b] % P * fainv[a - b] % P);
    }

    public static int pow(int a, int b, int P) {
        int ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (int) (ans * a % P);
            }
            a = (int) (a * a % P);
            b >>= 1;
        }
        return ans;
    }
}