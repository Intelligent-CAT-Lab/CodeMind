public class p03935 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int M = 998244353;
        int[] e = {1, 0, 0, 1};
        int[] z = {1, 1, 1, 0};
        int c = 1;
        int[] I = {1, 1};
        for (int i = 2; i < n; i++) {
            I[i] = (M - M / i) * I[M % i] % M;
        }
        for (int i = 0; i < n - 1; i++) {
            int r = (e[1] + c * (M - f(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i) * I[i + 1] % M;
            e = g(e, z);
            z = g(z, z);
        }
        System.out.println(e[1]);
    }

    public static int[] g(int[] a, int[] b) {
        int[] res = new int[4];
        res[0] = (a[0] * b[0] + a[1] * b[2]) % M;
        res[1] = (a[0] * b[1] + a[1] * b[3]) % M;
        res[2] = (a[2] * b[0] + a[3] * b[2]) % M;
        res[3] = (a[2] * b[1] + a[3] * b[3]) % M;
        return res;
    }

    public static int f(int n) {
        int[] e = {1, 0, 0, 1};
        int[] z = {1, 1, 1, 0};
        while (n > 0) {
            if (n % 2 == 1) {
                e = g(e, z);
            }
            z = g(z, z);
            n /= 2;
        }
        return e[1];
    }
}