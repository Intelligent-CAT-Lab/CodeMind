import java.util.*;
public class p03935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] I = new int[n];
        I[0] = 1;
        for (int i = 1; i < n; i++) {
            I[i] = (int) ((long) (998244353 - 998244353 / i) * I[i - 1] % 998244353);
        }
        int r = 1;
        int c = 1;
        for (int i = 0; i < n - 1; i++) {
            r = (r + c * (998244353 - f(2 * n - 2 - 2 * i))) % 998244353;
            c = c * (m + i) * I[i + 1] % 998244353;
        }
        System.out.println(r);
    }

    public static int f(int n) {
        int[] e = new int[]{1, 0, 0, 1};
        int[] z = new int[]{1, 1, 1, 0};
        while (n > 0) {
            e = new int[]{e, g(e, z)[n % 2]}[0];
            z = g(z, z);
            n /= 2;
        }
        return e[1];
    }

    public static int[] g(int[] a, int[] b) {
        int[] ans = new int[4];
        ans[0] = (a[0] * b[0] + a[1] * b[2]) % 998244353;
        ans[1] = (a[0] * b[1] + a[1] * b[3]) % 998244353;
        ans[2] = (a[2] * b[0] + a[3] * b[2]) % 998244353;
        ans[3] = (a[2] * b[1] + a[3] * b[3]) % 998244353;
        return ans;
    }
}