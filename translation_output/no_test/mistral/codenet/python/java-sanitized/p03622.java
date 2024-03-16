import java.util.Arrays;
import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int[] m = new int[] {476, 1};
        int[] f = new int[M];
        int[] g = new int[M];
        int i = 0;
        while (i < M) {
            f[i] = f[i - 1] * i % m[0];
            i++;
        }
        int j = 0;
        while (j < M) {
            g[j] = (int) Math.pow(M * f[j], m[1] - 2, m[0]);
            j++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = scanner.nextInt();
        System.out.print("Enter B: ");
        int B = scanner.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int k = 1;
        while (j <= B) {
            i += k * f[A + B - j] * g[B - j];
            k = (k * 2) % m[0];
            j++;
        }
        System.out.println((i * f[B] * g[A + B] + A) % m[0]);
    }
}