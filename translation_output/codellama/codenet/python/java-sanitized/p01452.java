import java.util.Scanner;

public class p01452 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] cm = new int[1000001];
        cm[0] = 1;
        for (int i = 1; i < 1000001; i++) {
            cm[i] = cm[i - 1] * i % 1000000;
        }
        int r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            int mt = comb(n + m + k * 2, n + i * 2);
            int lk = 1;
            if (i > 0) {
                lk = (comb(n + i * 2, i) - comb(n + i * 2, i - 1)) % 1000000;
            }
            int rk = 1;
            if (j > 0) {
                rk = (comb(m + j * 2, j) - comb(m + j * 2, j - 1)) % 1000000;
            }
            r += mt * lk * rk % 1000000;
            r %= 1000000;
        }
        System.out.println(r);
    }

    public static int comb(int a, int b) {
        return (cm[a] * inv(cm[a - b]) % 1000000) * inv(cm[b]) % 1000000;
    }

    public static int inv(int x) {
        return (int) Math.pow(x, 1000000 - 2) % 1000000;
    }
}