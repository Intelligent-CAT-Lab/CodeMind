import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[m];
        int[] g = new int[m];
        f[0] = 1;
        g[0] = 1;
        for (int i = 1; i < m; i++) {
            f[i] = f[i - 1] * i % m;
            g[i] = g[i - 1] * i % m;
        }
        int i = 1;
        while (i < m) {
            f[i] = (f[i] + f[i - 1] * i % m) % m;
            i++;
        }
        i = m - 1;
        g[i] = (int) (g[i] * Math.pow(M * f[i], m - 2) % m);
        while (i > 0) {
            g[i - 1] = (int) (g[i] * i % m);
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int j = 1;
        int k = 1;
        i = 0;
        while (j <= B) {
            i = (int) (i + k * f[A + B - j] * g[B - j] % m);
            k = (int) (k * 2 % m);
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m);
    }
}