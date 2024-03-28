import java.util.*;
import java.math.*;

public class p02875 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int P = 998244353;

        int[] fa = new int[N+10];
        int[] fainv = new int[N+10];
        fa[0] = 1;
        fainv[0] = 1;
        for (int i = 0; i < N; i++) {
            fa[i+1] = fa[i] * (i+1) % P;
        }
        fainv[N] = pow(fa[N], P-2, P);
        for (int i = N-1; i >= 0; i--) {
            fainv[i] = fainv[i+1] * (i+1) % P;
        }
        int C(int a, int b) {
            if (b < 0 || b > a) return 0;
            return fa[a] * fainv[b] % P * fainv[a-b] % P;
        }

        int ans = pow(3, N, P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P;
        }

        System.out.println(ans);
    }
}