import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[M];
        int[] g = new int[M];
        int i = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        i = 1;
        while (i < M) {
            g[i] = (int) Math.pow(M * f[i], m - 2, m);
            i++;
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
        int i = 0;
        while (j <= B) {
            i += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m;
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m);
    }
}