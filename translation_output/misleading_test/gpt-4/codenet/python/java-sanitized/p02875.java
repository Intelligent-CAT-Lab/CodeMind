import java.util.Scanner;

public class p02875 {

    private static final int P = 998244353;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int nn = N + 10;
        
        long[] fa = new long[nn + 1];
        long[] fainv = new long[nn + 1];
        
        fa[0] = 1;
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = fa[i] * (i + 1) % P;
        }
        fainv[nn] = pow(fa[nn], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        }
        
        long ans = pow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i, fa, fainv) * pow(2, N - i, P)) % P;
            if(ans < 0) ans += P;
        }
        
        System.out.println(ans);
        scanner.close();
    }
    
    private static long C(int a, int b, long[] fa, long[] fainv) {
        if (0 <= b && b <= a) {
            return fa[a] * fainv[b] % P * fainv[a - b] % P;
        }
        return 0;
    }
    
    private static long pow(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
}