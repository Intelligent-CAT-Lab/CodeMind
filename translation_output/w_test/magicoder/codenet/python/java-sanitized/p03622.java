import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[m];
        int[] g = new int[m];
        int i = 1;
        f[0] = 1;
        while (i < m) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[m - 1] = (int) Math.pow(M * f[m - 1], m - 2) % m;
        i = m - 1;
        while (i > 0) {
            g[i - 1] = (g[i] * i) % m;
            i--;
        }
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
            i += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m);
    }
}