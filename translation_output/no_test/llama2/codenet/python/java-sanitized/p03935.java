public class p03935 {
    public int solution(int n, int m) {
        int[] i = new int[]{1, 0, 0, 1};
        int[] z = new int[]{1, 1, 1, 0};
        int[] e = new int[2];
        while (n > 0) {
            e[0] = i[0];
            e[1] = g(i, z)[n % 2];
            z = g(z, z);
            n /= 2;
        }
        return e[1];
    }

    private int[] g(int[] a, int[] b) {
        int[] c = new int[4];
        c[0] = (a[0] * b[0] + a[1] * b[2]) % 998244353;
        c[1] = (a[0] * b[1] + a[1] * b[3]) % 998244353;
        c[2] = (a[2] * b[0] + a[3] * b[2]) % 998244353;
        c[3] = (a[2] * b[1] + a[3] * b[3]) % 998244353;
        return c;
    }
}