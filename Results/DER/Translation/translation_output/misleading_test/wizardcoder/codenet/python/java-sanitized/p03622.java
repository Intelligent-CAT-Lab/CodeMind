import java.math.BigInteger;
import java.util.Scanner;

public class p03622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[M];
        int[] g = new int[M];
        f[0] = 1;
        g[0] = 1;
        int i = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[0] = (int) Math.pow(M * f[0], m - 2, m);
        i = 1;
        while (i < M) {
            g[i] = (g[i - 1] * i) % m;
            i++;
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int j = 1;
        int k = 1;
        int iSum = 0;
        while (j <= B) {
            iSum = (iSum + k * f[A + B - j] * g[B - j]) % m;
            k = (k * 2) % m;
            j++;
        }
        System.out.println(iSum);
    }
}